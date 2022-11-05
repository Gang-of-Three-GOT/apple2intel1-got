package com.goteatfproject.appgot.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter @Setter @ToString
public class Party {
 
  private int no; 
  private String meal;
  private String food;
  private String title;
  private String content;
  private String nick;
  private String gender;
  private int max;
  private Date time;
  private int age;
  private int limit;
  private String location;
  private String post;
  private String address;
  private int viewCnt;
  private String image;
  private String pub;
  private Date createDate;

  private Member Writer;
}
