package com.superwen.dataobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: luowen<bigpao.luo@gmail.com>
 * @time: 11/25/2016.
 */
public class UserInfoRO {

    private int id;

    private String username;

    private String email;

    private List<PostRO> posts = new ArrayList<PostRO>();

    public UserInfoRO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PostRO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostRO> posts) {
        this.posts = posts;
    }
}
