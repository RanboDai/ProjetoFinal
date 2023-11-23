package com.example.projeto.model;

public class ebooks {
    int imgEbook;
    String ebookName;
    String ebookDescription;
    String price;

    public ebooks(int imgEbook, String ebookName, String ebookDescription, String price) {
        this.imgEbook = imgEbook;
        this.ebookName = ebookName;
        this.ebookDescription = ebookDescription;
        this.price = price;
    }

    public int getImgEbook() {
        return imgEbook;
    }

    public String getEbookName() {
        return ebookName;
    }

    public String getEnbookDescription() {
        return ebookDescription;
    }

    public String getPrice() {
        return price;
    }

}
