package com.example.neo4j.controller

import com.example.neo4j.service.MovieService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/movies")
class MovieController(private val movieService: MovieService) {

    @GetMapping("/find/{name}")
    fun findMovieByName( @PathVariable("name") name: String) = movieService.findMovieByName(name)
    @DeleteMapping("/delete/{name}")
    fun deleteMovieByName(name: String) = movieService.deleteMovieByName(name)

}