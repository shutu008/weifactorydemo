import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class Demo {
 
	
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) throws Exception{
        String[] split = "00000100#0003#999#".split("#");
        System.out.println(split.length);
    }
}
