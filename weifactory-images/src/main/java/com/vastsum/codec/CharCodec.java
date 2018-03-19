package com.vastsum.codec;

import com.vastsum.decoder.ByteToCharDecoder;
import com.vastsum.encoder.CharToByteEncoder;
import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * 继承 CombinedChannelDuplexHandler，用于绑定编码器与解码器
 * @author ssj
 * @create 2017-11-05 10:33
 */
public class CharCodec extends CombinedChannelDuplexHandler<ByteToCharDecoder, CharToByteEncoder> {

    public CharCodec(){
        super(new ByteToCharDecoder(), new CharToByteEncoder());
    }
}
