package com.bryonnicoson.news;

import com.bryonnicoson.news.model.NewsArticle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bryon on 2/20/18.
 */

public class NewsStore {
    private static List<NewsArticle> newsArticles = new ArrayList<>();

    public static List<NewsArticle> getNewsArticles() {
        return newsArticles;
    }

    public static void setNewsArticles(List<NewsArticle> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }
}
