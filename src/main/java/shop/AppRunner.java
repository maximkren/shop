/**
 * 
 */
package shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maxim Kren E-mail: krenmaxim@gmail.com 24 дек. 2018 г. 17:32:14
 */
@RestController
@EnableAutoConfiguration
public class AppRunner {

	@RequestMapping("/")

	String home() {
		return " Working!!! ";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppRunner.class, args);

	}

}
