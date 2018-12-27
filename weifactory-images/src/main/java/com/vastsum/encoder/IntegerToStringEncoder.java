package com.vastsum.encoder;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * 编码器,将integer编码成String，MessageToMessageEncoder实现
 * @author ssj
 * @create 2017-11-05 10:11
 */
public class IntegerToStringEncoder extends MessageToMessageEncoder<Integer> {
    @Override
    protected void encode(ChannelHandlerContext ctx, Integer msg, List<Object> out) throws Exception {

        out.add(String.valueOf(msg));
    }
}
