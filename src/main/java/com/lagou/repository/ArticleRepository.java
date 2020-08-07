package com.lagou.repository;

import com.lagou.entity.Article;
import com.lagou.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
