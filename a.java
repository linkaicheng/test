package com.itmuch.cloud.entity;

import java.math.BigDecimal;

public class User {

	
	//本地新开发
	1
	2
	3
	4
	
>>>>>>> Stashed changes
	
  private Long id;

  private String username;

  private String name;

  private Short age;

  private BigDecimal balance;
  //修复bug
  1
  1
  1

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Short getAge() {
    return this.age;
  }

  public void setAge(Short age) {
    this.age = age;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

}
