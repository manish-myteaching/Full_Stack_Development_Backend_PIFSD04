package com.professionalit.runner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.professionalit.entity.Comment;
import com.professionalit.entity.Post;
import com.professionalit.repository.PostRepository;

@Component
public class OneToManyRunner implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

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

		Comment comment2 = new Comment();
		comment2.setCommentId(202);
		comment2.setCommentInfo("Informative Session");
		comment2.setCreatedDate(new Date());
		comment2.setCreatedBy("Ramesh");

		post.setComment(List.of(comment1, comment2));

		//postRepository.save(post);

		Optional<Post> post1 = postRepository.findById(101);
		if (post1.isPresent()) {
			List<Comment> listComments = post1.get().getComment();
			System.out.println(listComments);
		}

	}

}
