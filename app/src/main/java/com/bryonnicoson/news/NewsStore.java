package com.bryonnicoson.news;

import com.bryonnicoson.news.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bryon on 2/20/18.
 */

public class NewsStore {


    private static List<Article> newsArticles = new ArrayList<>();

    public static List<Article> getArticles() {
        return newsArticles;
    }

    public static void setArticles(List<Article> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }

    public static List<Article> getNewsArticles() {
        return newsArticles;
    }

    public static void setNewsArticles(List<Article> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }
}
