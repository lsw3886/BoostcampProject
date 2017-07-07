package com.example.lsw38.facebook;

import android.widget.ImageView;

/**
 * Created by lsw38 on 2017-07-06.
 */

public class PostItem {
    String user_name;
    String date;
    ImageView profile_photo;
    ImageView content_photo;




    public PostItem(String user_name, String date, ImageView profile_photo, ImageView content_photo) {
        this.user_name = user_name;
        this.date = date;
        this.profile_photo = profile_photo;
        this.content_photo = content_photo;
    }

    public ImageView getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(ImageView profile_photo) {
        this.profile_photo = profile_photo;
    }

    public ImageView getContent_photo() {
        return content_photo;
    }

    public void setContent_photo(ImageView content_photo) {
        this.content_photo = content_photo;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
