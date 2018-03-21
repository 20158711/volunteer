package com.volunteer.service.impl;

import com.volunteer.dao.ArticleDao;
import com.volunteer.pojo.Article;
import com.volunteer.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article findById(Long id) {
        return articleDao.getOne(id);
    }

    @Override
    public List<Article> findByType(Integer type) {
        return articleDao.findByType(type);
    }

    @Override
    public Article save(Article article) {
        return articleDao.save(article);
    }
}
