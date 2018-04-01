package com.vastsum.decoder;

import java.nio.charset.Charset;
import java.util.List;

import com.vastsum.entity.ImageData;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * 图片解码器
 * @author ssj
 * @create 2017-11-05 9:46
 */
public class ImageDecoder extends ByteToMessageDecoder  {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		//判断缓冲区有多少字符，
		if (in.readableBytes() < 37) {
			return;
		}
		
		//记录包头开始的指针
		in.markReaderIndex();
		
		//循环寻找包头
		while(true){
			//readCharSequence会移动read索引
			CharSequence sequence = in.readCharSequence(5, Charset.forName("UTF-8"));
			if (sequence.equals("#ZWGC")) {
				break;
			}
		}
		
		//读取的是头部信息：#ZWGC2017100800003#M001#JPG#99999999#
		//已经读取了#ZWGV数据，接下来读取 2017100800003#M001#JPG#99999999# 字符串
		byte[] header = new byte[32];
		//已经读取一部分数据了，读指针已经移动
		in.readBytes(header);//这句读过数据后，缓存中已经少了37byte
		String headerStr = new String(header);
		
		String[] sp = headerStr.split("#");
		if (sp.length <4) {
			ctx.close();
			throw new RuntimeException("数据解码异常");
		}
		String sn = "ZWGC"+sp[0];
		String sensorType = sp[1];
		String picType = sp[2];
		Integer dataLen = Integer.valueOf(sp[3]);
		
		if (in.readableBytes()<dataLen) {
			//读指针重置（图片数据可能没过来完全，重新从包头开始）
			in.resetReaderIndex();
			return;
		}
		byte[] data = new byte[dataLen];
		in.readBytes(data);
		
		ImageData imageData = new ImageData();
		imageData.setSn(sn);
		imageData.setSensorType(sensorType);
		imageData.setPicType(picType);
		imageData.setDataLen(dataLen);
		imageData.setImageByte(data);
		out.add(imageData);
			
	}
}
