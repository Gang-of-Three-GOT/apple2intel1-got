package com.goteatfproject.appgot.vo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {

  private String id;
  private String password;
  private String password2;
  private String name;
  private String nick;
  private String email;
  private int post;
  private String address;
  private String phone;
  private String hobby;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword2() {
    return password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNick() {
    return nick;
  }

  public void setNick(String nick) {
    this.nick = nick;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getPost() {
    return post;
  }

  public void setPost(int post) {
    this.post = post;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", password='" + password + '\'' +
        ", password2='" + password2 + '\'' +
        ", name='" + name + '\'' +
        ", nick='" + nick + '\'' +
        ", email='" + email + '\'' +
        ", post=" + post +
        ", address='" + address + '\'' +
        ", phone='" + phone + '\'' +
        ", hobby='" + hobby + '\'' +
        '}';
  }
}
