package com.bryonnicoson.news.model;

/**
 * Created by bryon on 2/20/18.
 */

public class NewsArticle {

    private String title;
    private String contents;
    private String imageUrl;
    private String time;
    private String articleUrl;

    public NewsArticle(String title, String contents, String imageUrl, String time, String articleUrl) {
        this.title = title;
        this.contents = contents;
        this.imageUrl = imageUrl;
        this.time = time;
        this.articleUrl = articleUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }




}
