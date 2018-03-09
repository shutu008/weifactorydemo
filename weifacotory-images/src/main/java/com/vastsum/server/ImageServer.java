package com.vastsum.server;

import com.vastsum.entity.Image;

/**
 * 图片处理服务
 * @author ssj
 * @create 2017-11-11 9:43
 */
public interface ImageServer {

    /**
     * 保存图片
     * @param image
     * @return Integer
     */
    Integer save(Image image);
}
