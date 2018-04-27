package com.vastsum.entity;

import java.util.Date;

public class Post {
    private Integer postId;

    private Integer userId;

    private Integer visible;

    private Date gmtCreate;

    private String postMessage;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage == null ? null : postMessage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", userId=").append(userId);
        sb.append(", visible=").append(visible);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", postMessage=").append(postMessage);
        sb.append("]");
        return sb.toString();
    }
}