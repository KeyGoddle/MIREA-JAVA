package com.company;
import java.lang.*;
public class Book {
    private String title;
    private int Page;
    public Book (String n, int a){
        title = n;
        Page = a;
    }
    public Book(String n){
        title = n;
        Page = 0;
    }
    public Book(){
        title= "Book";
        Page = 0;
    }
    public void setPage(int Page) {
        this.Page = Page;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public int getPage() {
        return Page;
    }
    public String toString(){
        return this.title+", page "+this.Page;
    }
    public void intoPage(){
        System.out.println(title +" with number of pages "+Page);
    }
}
