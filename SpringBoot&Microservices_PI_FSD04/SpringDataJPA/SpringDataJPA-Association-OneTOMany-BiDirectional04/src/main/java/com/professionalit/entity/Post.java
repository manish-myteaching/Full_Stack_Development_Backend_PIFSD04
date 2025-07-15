package com.professionalit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "POST_OTM_BI")
public class Post {

	@Id
	@Column(name = "POST_ID")
	private int postId;

	@Column(name = "POST_TITLE", nullable = false)
	private String postTitle;

	@Column(name = "CREATED_DATE", nullable = false)
	private Date createdDate;

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_BY")
	private Date updateBy;

	// onetomany association
	@OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "post")
	@ToString.Exclude
	List<Comment> comment = new ArrayList<>();

}
