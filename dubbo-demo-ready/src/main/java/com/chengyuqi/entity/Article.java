package com.chengyuqi.entity;

public class Article {
	
	private Integer id;
	
	private String title;
	
	private String content;
	
	//分类名字
	private String name;
	
	//分类名字2
	private String name2;
	
	//是否热门
	private int hot;

	//状态
	private int status;
	
	//创建时间
	private String created;
	
	//浏览量
	private String commentCnt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getHot() {
		return hot;
	}

	public void setHot(int hot) {
		this.hot = hot;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(String commentCnt) {
		this.commentCnt = commentCnt;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", name=" + name + ", name2=" + name2
				+ ", hot=" + hot + ", status=" + status + ", created=" + created + ", commentCnt=" + commentCnt + "]";
	}

	public Article(Integer id, String title, String content, String name, String name2, int hot, int status,
			String created, String commentCnt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.name = name;
		this.name2 = name2;
		this.hot = hot;
		this.status = status;
		this.created = created;
		this.commentCnt = commentCnt;
	}

	public Article() {
		super();
	}
	
	
}

