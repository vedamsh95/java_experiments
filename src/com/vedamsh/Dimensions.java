package com.vedamsh;

public class Dimensions {

    private double width;
    private double height;

    double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showDim(){
        System.out.println(" Width of the shape is : " + width + " \n Height of the shape is : " + height  );
    }


}
