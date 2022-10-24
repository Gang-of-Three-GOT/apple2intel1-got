package com.goteatfproject.appgot.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Getter @Setter @ToString
public class User {

  private int no;
  private String id;
  private String pwd;
  private String pwd2;
  private boolean grade;
  private String name;
  private String nick;
  private Date birth;
  private String tel;
  private String gender;
  private Date inD2ate;
  private String postNum;
  private String mainAddr;
  private String subAddr;
  private String interest;
  private boolean outState;
  private Date outDate;
  private String pImg;
  private String intro;

}
