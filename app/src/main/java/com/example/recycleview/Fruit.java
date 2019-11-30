package com.example.recycleview;

public class Fruit {
    private String Name;
    private int imageId;
    public Fruit(String Name,int imageId){
        this.Name=Name;
        this.imageId=imageId;
    }
    public String getName(){
        return Name;
    }
    public int getImageId(){
        return imageId;
    }
}
