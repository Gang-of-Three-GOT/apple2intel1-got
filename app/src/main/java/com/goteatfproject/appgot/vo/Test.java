package com.goteatfproject.appgot.vo;


public class Test {

  private String title;
  private String content;
  private String writer;
  private String date;

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
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Test [title=" + title + ", content=" + content + ", writer=" + writer + ", date=" + date
        + "]";
  }

}
