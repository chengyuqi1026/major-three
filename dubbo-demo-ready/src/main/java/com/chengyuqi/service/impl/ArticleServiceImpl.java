package com.chengyuqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chengyuqi.dao.ArticleMapper;
import com.chengyuqi.entity.Article;
import com.chengyuqi.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleMapper mapper;

	@Override
	public List<Article> list() {
		return mapper.list();
	}
}
