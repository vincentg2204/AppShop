package com.example.windows10.appshop;

import android.graphics.Bitmap;

/**
 * Created by ASUS on 4/7/2018.
 */

public class Category {

    private Bitmap image;
    private String name, description;

    public Category(Bitmap image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}