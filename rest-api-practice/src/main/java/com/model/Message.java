package com.model;

import java.time.LocalDate;

public class Message {
	private long id;
	public void setId(long id) {
		this.id = id;
	}
	private String message;
	private String author;
	private LocalDate dateOfPost;
		
	public Message() {}
	public Message(int id, String message, String author, LocalDate dateOfPost) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.dateOfPost = dateOfPost;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getDateOfPost() {
		return dateOfPost;
	}
	public void setDateOfPost(LocalDate dateOfPost) {
		this.dateOfPost = dateOfPost;
	}
	
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", author=" + author + ", dateOfPost=" + dateOfPost + "]";
	}
}