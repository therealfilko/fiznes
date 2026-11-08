package io.github.therealfilko.fiznes;

import io.github.therealfilko.fiznes.exercise.ExerciseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FiznesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiznesApplication.class, args);
	}

	//Testen der Repo Exercise
	// @Bean
    // CommandLineRunner runQuery(ExerciseRepository repo) {
	// 	return args -> {
	// 		try {
	// 			var result = repo.findByIdWithMuscleGroups(1);
	// 			System.out.println("Ergebnis: " + result);
	// 		} catch (Exception e) {
	// 			e.printStackTrace();
	// 		}
	// 	};
	// }

}
