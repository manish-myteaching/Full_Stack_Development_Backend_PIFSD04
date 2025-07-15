package com.professionalit.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COMMENT_MTO")
public class Comment {

	@Id
	@Column(name = "COMMENT_ID")
	private int commentId;

	@Column(name = "COMMENT_INFO", nullable = false)
	private String commentInfo;

	@Column(name = "CREATED_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_BY")
	private Date updateBy;

	// manytoone association
	@ManyToOne(targetEntity = Post.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "post_id") // FK
	private Post post;

}
