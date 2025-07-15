package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professionalit.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
