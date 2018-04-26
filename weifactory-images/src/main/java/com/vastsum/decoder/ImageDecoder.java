package com.vastsum.decoder;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vastsum.entity.DataEntity;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * 图片解码器
 * @author ssj
 * @create 2017-11-05 9:46
 */
public class ImageDecoder extends ByteToMessageDecoder  {

	private static Logger logger = LoggerFactory.getLogger(ImageDecoder.class);
	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		//判断缓冲区有多少字符，#ZWGC#00000100#0003#999#AAAAAAAAAA…#1234567890123$
		if (in.readableBytes() < 24) {
			return;
		}
		
		//记录包头开始的指针
		in.markReaderIndex();
		
		//循环寻找包头
		while(true){
			//readCharSequence会移动read索引
			CharSequence sequence = in.readCharSequence(6, Charset.forName("UTF-8"));
			if (sequence.equals("#ZWGC#")) {
				logger.info("找到数据协议包");
				break;
			}
		}
		
		//读取的是头部信息：#ZWGC#00000100#0003#999#或者#ZWGC#00000017#0005#001#
		//已经读取了#ZWGC数据
		byte[] header = new byte[18];
		//已经读取一部分数据了，读指针已经移动
		in.readBytes(header);//这句读过数据后，缓存中已经少了24byte
		String headerStr = new String(header);
		
		String[] sp = headerStr.split("#");
		if (sp.length <3) {
			ctx.close();
			throw new RuntimeException("数据解码异常");
		}
		Integer dataLen = Integer.parseInt(sp[0]);
		String moduleType = sp[1];
		String sensorType = sp[2];
		if (in.readableBytes()<dataLen) {
			//读指针重置（图片数据可能没过来完全，重新从包头开始）
			logger.info("指针重置，再次读取数据");
			in.resetReaderIndex();
			return;
		}
		
		
		byte[] data = new byte[dataLen];
		in.readBytes(data);
		
		DataEntity dataEntity = new DataEntity();
		dataEntity.setData(data);
		dataEntity.setDataLen(dataLen);
		dataEntity.setDate(new Date());
		dataEntity.setModuleType(moduleType);
		dataEntity.setSensorType(sensorType);
		out.add(dataEntity);
		
		//丢弃一部分数据
//		if ("0005".equals(moduleType) && "001".equals(sensorType)) {
//			in.readCharSequence(15, Charset.forName("UTF-8"));
//		}
		in.readCharSequence(15, Charset.forName("UTF-8"));
		
		}
		
}
