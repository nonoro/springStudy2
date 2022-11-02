package com.example.secondproject.dto;

import com.example.secondproject.Entity.Article;

public class ArticleForm {

    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArticleForm{");
        sb.append("title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
