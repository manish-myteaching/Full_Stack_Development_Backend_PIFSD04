package com.professionalit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.professionalit.Entity.Book;
import com.professionalit.repository.BookRepository;

@SpringBootApplication
public class SpringDataJpaCurdRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaCurdRepositoryApplication.class, args);
		BookRepository bookRepo = ctx.getBean(BookRepository.class);
//		Book book = new Book(101, "SpringBook", 500.00);
//		Book book1 = bookRepo.save(book);
//
//		Book book3 = new Book(102, "SpringBoot", 500.00);
//		Book book4 = bookRepo.save(book3);
//		System.out.println("Record inserted Successfully..!" + book3);

		// Optional<Book> book2 = bookRepo.findById(101);
		// if (book2.isPresent()) {
		// System.out.println(book2.get());
		// }

		// Iterable<Book> it = bookRepo.findAll();

		// for (Book book8 : it) {
		// System.out.println(book8);
		// }

		// it.forEach((k) -> System.out.println(k));

		// System.out.println(bookRepo.count());

		// Iterable<Book> it2 = bookRepo.findAllById(List.of(101, 102));
		// it2.forEach((k) -> System.out.println(k));

		// List<Book> list = bookRepo.findByBookPriceLessThan(300.0);
		// list.forEach(System.out::println);

		// List<Book> list = bookRepo.findByBookName("SpringBoot");
		// list.forEach(System.out::println);

		List<String> list = bookRepo.getAllBookHQL();
		list.forEach(System.out::println);
	}

}
