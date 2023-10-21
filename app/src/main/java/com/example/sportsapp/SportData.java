package com.example.sportsapp;

public class SportData {
    String imageName;
    String name;

    public SportData(String imageName, String name) {
        this.imageName = imageName;
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
