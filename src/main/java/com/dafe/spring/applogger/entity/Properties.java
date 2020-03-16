package com.dafe.spring.applogger.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="properties")
public class Properties {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="locationX")
	private Integer locationX;
	
	@Column(name="locationY")
	private Integer locationY;

	@Column(name="viewedId")
	private String viewedId;

	@Column(name="pageFrom")
	private String pageFrom;
	
	@Column(name="pageTo")
	private String pageTo;

	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="action_id")
	private Action action;

	
	public Properties() {
		
	}
	
	public Properties(Integer locationX, Integer locationY, String viewedId, String pageFrom, String pageTo) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.viewedId = viewedId;
		this.pageFrom = pageFrom;
		this.pageTo = pageTo;
	}


	public Integer getLocationX() {
		return locationX;
	}

	public void setLocationX(Integer locationX) {
		this.locationX = locationX;
	}

	public Integer getLocationY() {
		return locationX;
	}

	public void setLocationY(Integer locationY) {
		this.locationY = locationY;
	}

	public String getViewedId() {
		return viewedId;
	}

	public void setViewedId(String viewedId) {
		this.viewedId = viewedId;
	}

	public String getPageFrom() {
		return pageFrom;
	}

	public void setPageFrom(String pageFrom) {
		this.pageFrom = pageFrom;
	}

	public String getPageTo() {
		return pageTo;
	}

	public void setPageTo(String pageTo) {
		this.pageTo = pageTo;
	}

	@Override
	public String toString() {
		return "Properties [locationX=" + locationX +", locationY=" + locationY + ", viewedId=" + viewedId + ", pageFrom=" + pageFrom + ", pageTo="
				+ pageTo + "]";
	}
	
}
