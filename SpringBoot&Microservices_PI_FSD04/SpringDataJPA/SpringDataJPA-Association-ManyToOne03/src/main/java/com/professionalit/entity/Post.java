package com.professionalit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "POST_MTO")
public class Post {

	@Id
	@Column(name = "POST_ID")
	private int postId;

	@Column(name = "POST_TITLE", nullable = false)
	private String postTitle;

	@Column(name = "CREATED_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_BY")
	private Date updateBy;


}
