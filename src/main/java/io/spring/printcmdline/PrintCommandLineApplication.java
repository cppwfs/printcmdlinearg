package io.spring.printcmdline;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PrintCommandLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintCommandLineApplication.class, args);
	}


	@Bean
	public ApplicationRunner applicationRunner() {
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				for (String arg : args.getSourceArgs()) {
					System.out.println("ARG ==>"  + arg);
				}
			}
		};
	}
}
