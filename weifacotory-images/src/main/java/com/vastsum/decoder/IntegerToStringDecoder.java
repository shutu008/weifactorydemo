package com.vastsum.decoder;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * 将接收的Integer消息转化成String类型，MessageToMessageDecoder实现
 * @author ssj
 * @create 2017-11-05 9:59
 */
public class IntegerToStringDecoder extends MessageToMessageDecoder<Integer> {


    @Override
    protected void decode(ChannelHandlerContext ctx, Integer msg, List<Object> out) throws Exception {

        out.add(String.valueOf(msg));
    }
}
