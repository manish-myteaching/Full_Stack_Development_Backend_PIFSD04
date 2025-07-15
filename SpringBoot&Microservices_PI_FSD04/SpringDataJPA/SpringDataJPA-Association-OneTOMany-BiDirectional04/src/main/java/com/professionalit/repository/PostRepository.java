package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professionalit.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
