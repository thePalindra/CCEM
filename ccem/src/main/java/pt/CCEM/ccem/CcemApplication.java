package pt.CCEM.ccem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CcemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcemApplication.class, args);
	}

}
