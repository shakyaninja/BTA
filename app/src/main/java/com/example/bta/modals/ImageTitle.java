package com.example.bta.modals;

public class ImageTitle {
    private String title;
    private int images;

    public ImageTitle(String title, int images) {
        this.title = title;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
