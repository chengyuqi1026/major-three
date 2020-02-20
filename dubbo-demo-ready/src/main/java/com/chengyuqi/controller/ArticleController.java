package com.chengyuqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chengyuqi.entity.Article;
import com.chengyuqi.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping
	public String list(Model model,@RequestParam(defaultValue="1")int sortt,@RequestParam(defaultValue="1")int pageNum){
		
		PageHelper.startPage(pageNum,5);
		
		List<Article> list = articleService.list();
		PageInfo<Article> pageInfo = new PageInfo<Article>(list);
		List<Article> list2 = pageInfo.getList();
		for (Article article : list2) {
			System.out.println(article);
		}
		model.addAttribute("pg", pageInfo);
		
		return "list";
	}
	
}
