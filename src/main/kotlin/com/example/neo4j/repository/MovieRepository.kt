package com.example.neo4j.repository

import com.example.neo4j.model.Movie
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.data.neo4j.repository.query.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
public interface MoviesRepository : Neo4jRepository<Movie, Long> {
    @Query("MATCH (n:Movie) WHERE n.name = {params} RETURN n ")
    fun findMovieByName(@Param("params") params: String): Movie

    @Query("MATCH (n:Movie) WHERE n.name = {params} DELETE n ")
    fun deleteMovieByName(@Param("params") params: String)
}