package com.habuma.spitter.remote.dto;

import java.io.Serializable;
import java.util.Date;

public class SpittleDTO implements Serializable{

  private static final long serialVersionUID = -1508835362555787685L;
	
  private long id;
  
  private SpitterDTO spitterDto;
  
  private String text;
  
  private Date when; 
  
  public SpittleDTO(){
	  
  }
  
  public SpittleDTO( SpitterDTO spitterDto, String text, Date when ){
	  
	  this.spitterDto = spitterDto;
	  
	  this.text = text;
	  
	  this.when = when;
	  
  }
  
  public long getId() {
    return this.id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  public Date getWhen() {
    return this.when;
  }

  public void setWhen(Date when) {
    this.when = when;
  }

  public SpitterDTO getSpitterDTO() {
    return this.spitterDto;
  }

  public void setSpitter(SpitterDTO spitter) {
    this.spitterDto = spitter;
  }
}
