package com.ufasoli.tutorials.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 04.02.14
 * Time: 11:02
 */
@Entity
public class Book implements Serializable{


    @Id
    protected String isbn;
    protected String title;
    protected String author;
    @Column(length = 2000)
    protected String description;


    public String getDescription(){
       return description;
    }

    public void setDescription(String description){
       this.description = description;
    }


    public String getAuthor(){
       return author;
    }

    public void setAuthor(String author){
       this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
