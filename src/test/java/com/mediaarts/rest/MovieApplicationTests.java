package com.mediaarts.rest;


import com.mediaarts.rest.models.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.boot.test.*;
import org.springframework.http.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.web.*;
import org.springframework.web.client.*;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by andrewssamuel on 5/9/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MovieApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=9000")
public class MovieApplicationTests {

    private RestTemplate restTemplate = new TestRestTemplate();

    private String moviesURL = "http://localhost:9000/movies";

    @Test
    public void contextLoads(){

        ResponseEntity<ArrayList> entity = this.restTemplate.getForEntity(moviesURL,ArrayList.class);
        assertThat(entity.getStatusCode().is2xxSuccessful()).isTrue();

    }

    @Test
    public void getAllMovies(){

        Movie[] movies = restTemplate.getForObject(moviesURL, Movie[].class);
        assert(movies[0].getMovieName()).equalsIgnoreCase("The Jungle Book");

    }

}
