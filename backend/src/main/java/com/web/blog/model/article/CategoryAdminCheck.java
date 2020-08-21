package com.web.blog.model.article;

public class CategoryAdminCheck {
    private String category;
    private String uid;

    public CategoryAdminCheck() {
    }

    public CategoryAdminCheck(String category, String uid) {
        this.category = category;
        this.uid = uid;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "CategoryAdminCheck{" +
                "category='" + category + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

}