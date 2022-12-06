package com.example.databindingviewmodellivedata;

public class Quote {

    String desc,author;

    public Quote(String desc, String author) {
        this.desc = desc;
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
