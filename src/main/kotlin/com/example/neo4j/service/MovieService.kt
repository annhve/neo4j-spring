package com.example.neo4j.service

import com.example.neo4j.model.Movie
import com.example.neo4j.repository.MoviesRepository
import org.springframework.stereotype.Service

@Service
class MovieService(private val moviesRepository: MoviesRepository) {

    fun findMovieByName(name: String): Movie = moviesRepository.findMovieByName(name)

    fun deleteMovieByName(name: String) = moviesRepository.deleteMovieByName(name)}
