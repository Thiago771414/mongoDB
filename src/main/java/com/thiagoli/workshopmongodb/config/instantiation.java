package com.thiagoli.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.thiagoli.workshopmongodb.domain.Post;
import com.thiagoli.workshopmongodb.domain.User;
import com.thiagoli.workshopmongodb.dto.AuthorDTO;
import com.thiagoli.workshopmongodb.dto.CommentDTO;
import com.thiagoli.workshopmongodb.repository.PostRepository;
import com.thiagoli.workshopmongodb.repository.UserRepository;

@Configuration
public class instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		
		// TODO Auto-generated method stub
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("11/06/2023"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("10/06/2023"), "Bom Dia", "Acordei feliz hoje!", new AuthorDTO(maria));
		
		CommentDTO c1 = new CommentDTO("Boa viagem mano!", sdf.parse("09/06/2023"), new AuthorDTO(alex));
		CommentDTO c2 = new CommentDTO("Aproveite!", sdf.parse("10/06/2023"), new AuthorDTO(alex));
		CommentDTO c3 = new CommentDTO("Boa viagem mano!", sdf.parse("11/06/2023"), new AuthorDTO(alex));
		
		post1.getComents().addAll(Arrays.asList(c1, c2));
		post1.getComents().addAll(Arrays.asList(c3));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
	}
}
