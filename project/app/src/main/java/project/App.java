package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableTransactionManagement
@SpringBootApplication
public class App implements WebMvcConfigurer {

  Logger log = LogManager.getLogger(getClass());

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
    .allowedOrigins("http://localhost:5500", "http://127.0.0.5500")
    .allowedMethods("*");
  }
}
