package com.gree.model;

/**
 * 图书实体
 * @author Administrator
 *
 */
public class Material {
	private int id;//编号
	private String materName;//图书名称
	private String author;//作者
	private String sex;//性别
	private Float price;//图书价格
	private Integer bookTypeId;//图书的类别Id
	private String bookTypeName;//图书的类别名称
	private String bookDesc;//图书的备注
	
	
	public Material(String bookName, String author, Integer bookTypeId) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bookTypeId = bookTypeId;
	}
	
	public Material(String bookName, String author, String sex, Float price,
			Integer bookTypeId, String bookDesc) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.sex = sex;
		this.price = price;
		this.bookTypeId = bookTypeId;
		this.bookDesc = bookDesc;
	}
	
	public Material(int id, String bookName, String author, String sex,
			Float price, Integer bookTypeId, String bookDesc) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.sex = sex;
		this.price = price;
		this.bookTypeId = bookTypeId;
		this.bookDesc = bookDesc;
	}
	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getBookTypeId() {
		return bookTypeId;
	}
	public void setBookTypeId(Integer bookTypeId) {
		this.bookTypeId = bookTypeId;
	}
	public String getBookTypeName() {
		return bookTypeName;
	}
	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	
}
