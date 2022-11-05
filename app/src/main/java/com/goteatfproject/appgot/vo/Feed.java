package com.goteatfproject.appgot.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Getter @Setter @ToString
public class Feed {

  private int no;
  private String title;
  private String content;
  private Date date;
  private Member writer;


}
