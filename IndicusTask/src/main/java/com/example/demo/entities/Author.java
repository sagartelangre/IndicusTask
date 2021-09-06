package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AuthorDetails")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int authorId;
	
	String authorName;
	String authorBooksWrite;
	float bookPrice;
	String authorAddress;
	String authorEmail;
	String authorPhoneno;
	public Author() {
		
	}
	public Author(int authorId, String authorName, String authorBooksWrite, float bookPrice, String authorAddress,
			String authorEmail, String authorPhoneno) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorBooksWrite = authorBooksWrite;
		this.bookPrice = bookPrice;
		this.authorAddress = authorAddress;
		this.authorEmail = authorEmail;
		this.authorPhoneno = authorPhoneno;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorBooksWrite() {
		return authorBooksWrite;
	}
	public void setAuthorBooksWrite(String authorBooksWrite) {
		this.authorBooksWrite = authorBooksWrite;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorAddress() {
		return authorAddress;
	}
	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getAuthorPhoneno() {
		return authorPhoneno;
	}
	public void setAuthorPhoneno(String authorPhoneno) {
		this.authorPhoneno = authorPhoneno;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorBooksWrite=" + authorBooksWrite
				+ ", bookPrice=" + bookPrice + ", authorAddress=" + authorAddress + ", authorEmail=" + authorEmail
				+ ", authorPhoneno=" + authorPhoneno + "]";
	}
	
	
	
	
	

}
