package uz.owl.blogpost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uz.owl.blogpost.dao.UserRepository;
import uz.owl.blogpost.entity.User;

import java.io.File;
import java.net.URL;

@SpringBootApplication
public class BlogPostApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlogPostApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		User user = new User("islombek", "pass");
//		userRepository.save(user);
//		user.setUsername("clkmdklmcds");
//		userRepository.save(user);
//		user.setPassword("lkcmdklcdskmc");
//		userRepository.save(user);

//		System.out.println("========================================");


	}

//	@Bean(name = "spring.datasource.data")
//	public String dataSql(){
//		URL resource = getClass().getResource(".");
//		File file = new File(resource.getPath()).getParentFile().getParentFile().getParentFile();
//
//		System.out.println(" ======================================= ");
//		System.out.println(file.getAbsolutePath() +"/data.sql");
//		return file.getAbsolutePath() +"/data.sql" ;
//	}
}
