package com.vastsum.entity;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Integer postId;

    private Integer userId;

    private Integer passiveCommentUserId;

    private Integer isPost;

    private Date gmtCreate;

    private Integer isDeleted;

    private String commentContent;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

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

    public Integer getPassiveCommentUserId() {
        return passiveCommentUserId;
    }

    public void setPassiveCommentUserId(Integer passiveCommentUserId) {
        this.passiveCommentUserId = passiveCommentUserId;
    }

    public Integer getIsPost() {
        return isPost;
    }

    public void setIsPost(Integer isPost) {
        this.isPost = isPost;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", postId=").append(postId);
        sb.append(", userId=").append(userId);
        sb.append(", passiveCommentUserId=").append(passiveCommentUserId);
        sb.append(", isPost=").append(isPost);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", commentContent=").append(commentContent);
        sb.append("]");
        return sb.toString();
    }
}