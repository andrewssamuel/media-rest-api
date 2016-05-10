package com.mediaarts.rest.resources;

import com.mediaarts.rest.Repositories.*;
import com.mediaarts.rest.models.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Created by andrewssamuel on 5/7/16.
 */
@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResources {

    private static final Logger log = LoggerFactory.getLogger(MovieResources.class);

    @Autowired
    private MovieRepository movieRepository;


    @GET
    public List getMovies() {
        return movieRepository.findAll();
    }
}
