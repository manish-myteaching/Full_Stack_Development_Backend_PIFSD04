package com.professionalit.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COMMENT_OTM")
public class Comment {

	@Id
	@Column(name = "COMMENT_ID")
	private int commentId;

	@Column(name = "COMMENT_INFO", nullable = false)
	private String commentInfo;

	@Column(name = "CREATED_DATE", nullable = false)
	private Date createdDate;

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_BY")
	private Date updateBy;


}
