package com.works.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iid;
	private String name;
	private String url;
	private String roles;
	private String details;
	private Date date;
	
}