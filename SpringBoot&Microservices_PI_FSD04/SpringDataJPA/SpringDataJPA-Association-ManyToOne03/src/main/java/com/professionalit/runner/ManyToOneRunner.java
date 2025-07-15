package com.professionalit.runner;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.professionalit.entity.Comment;
import com.professionalit.entity.Post;
import com.professionalit.repository.CommentRepository;

@Component
public class ManyToOneRunner implements CommandLineRunner {

	@Autowired
	CommentRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ManyToOneRunner");

		Post post = new Post();
		post.setPostId(101);
		post.setPostTitle("Spring Boot With Micoservies Association");
		post.setCreatedDate(new Date());
		post.setCreatedBy("Mahesh");

		Comment comment1 = new Comment();
		comment1.setCommentId(201);
		comment1.setCommentInfo("It was good session..!");
		comment1.setCreatedDate(new Date());
		comment1.setCreatedBy("Suresh");
		comment1.setPost(post);

		Comment comment2 = new Comment();
		comment2.setCommentId(202);
		comment2.setCommentInfo("Informative Session");
		comment2.setCreatedDate(new Date());
		comment2.setCreatedBy("Ramesh");
		comment2.setPost(post);

		// postRepository.save(comment1);
		// postRepository.save(comment2);

		Optional<Comment> comment = postRepository.findById(201);

		if (comment.isPresent()) {
			Post post1 = comment.get().getPost();
			System.out.println(post1);
		}

	}

}
