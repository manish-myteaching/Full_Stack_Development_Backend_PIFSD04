package com.professionalit.runner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.professionalit.entity.Comment;
import com.professionalit.entity.Post;
import com.professionalit.repository.CommentRepository;
import com.professionalit.repository.PostRepository;

@Component
public class OneToManyBiRunner implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

	@Autowired
	CommentRepository commentRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("OneToManyRunner");

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
		comment1.setPost(post); // Bidirectional

		Comment comment2 = new Comment();
		comment2.setCommentId(202);
		comment2.setCommentInfo("Informative Session");
		comment2.setCreatedDate(new Date());
		comment2.setCreatedBy("Ramesh");
		comment2.setPost(post); // Bidirectional

		post.setComment(List.of(comment1, comment2)); // Bidirectional

		// postRepository.save(post);

		Optional<Post> post1 = postRepository.findById(101); // fetch comment by post
		if (post1.isPresent()) {
			List<Comment> listComments = post1.get().getComment();
			for (Comment comment : listComments) {
				System.out.println(comment);
			}
		}

		Optional<Comment> comment = commentRepository.findById(201); // fet post by comment
		if (comment.isPresent()) {
			Post post2 = comment.get().getPost();
			System.out.println(post2);
		}

	}
}
