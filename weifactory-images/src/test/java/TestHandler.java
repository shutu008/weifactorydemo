import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class TestHandler  extends ChannelInboundHandlerAdapter {

	private static Logger logger = LoggerFactory.getLogger(TestHandler.class);
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		 String request = (String)msg;
		 logger.info("来自客户端的原始数据："+request);
	             ctx.writeAndFlush(Unpooled.copiedBuffer("a".getBytes()));
	            
	}
}
