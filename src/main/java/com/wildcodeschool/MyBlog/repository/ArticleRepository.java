package com.wildcodeschool.MyBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.MyBlog.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
