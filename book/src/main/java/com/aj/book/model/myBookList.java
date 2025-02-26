package com.aj.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "myBook")
public class myBookList {


    @Id
    private int id;
    private String bname;
    private String author;
    private double price;
    
    
    
    public myBookList() {
    super();
    }
    
    public myBookList(int id, String bname, String author, double price) {
        this.id = id;
        this.bname = bname;
        this.author = author;
        this.price = price;
    }



    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
