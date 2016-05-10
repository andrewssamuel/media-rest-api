package com.mediaarts.rest.Repositories;

import com.mediaarts.rest.models.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by andrewssamuel on 5/8/16.
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findAll();
}
