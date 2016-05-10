package com.mediaarts.rest;

import com.mediaarts.rest.Repositories.*;
import com.mediaarts.rest.models.*;
import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.*;
import org.springframework.context.annotation.*;


/**
 * Created by andrewssamuel on 5/7/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class MovieApplication {

    private static final Logger log = LoggerFactory.getLogger(MovieApplication.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(MovieApplication.class).run(args);
    }
/*
    // Programmatically adding the JAXRS Application class in the servlet container.
    // We can eliminate the below steps using Spring Boot by annotating @Component in JAX-RS Application Class.
    @Bean
    public ServletRegistrationBean restInit(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new ServletContainer(),"*//*");
        registrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyInitializr.class.getName());
        return registrationBean;
    }*/

    /*
       Bootstrap the database for initial use.
    */
   @Bean
    public CommandLineRunner bootstrap(MovieRepository movieRepository){

        return args -> {

                movieRepository.save(new Movie("The Jungle Book"));
                movieRepository.save(new Movie("Captain America:Civil War"));

                log.info("Movies found with FindAll");
                log.info("-------------------------------------------------");
                for(Movie movie:movieRepository.findAll()){
                    log.info(movie.getMovieName().toString());
                }
        };
    }
}
