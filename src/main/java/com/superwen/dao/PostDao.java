package com.superwen.dao;

import java.io.Serializable;
import java.sql.Date;

/**
 * @description:
 * @author: luowen<bigpao.luo@gmail.com>
 * @time: 11/25/2016.
 */
public class PostDao implements Serializable{

    private static final long serialVersionUID = 3458066540205490697L;

    private int id;

    private int userId;

    private String title;

    private String contents;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public PostDao() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
