package com.example.neo4j

import org.neo4j.driver.AuthTokens
import org.neo4j.driver.Driver
import org.neo4j.driver.GraphDatabase
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories

@SpringBootApplication
@EnableNeo4jRepositories
class Neo4jApplication


fun main(args: Array<String>) {
    runApplication<Neo4jApplication>(*args)
}