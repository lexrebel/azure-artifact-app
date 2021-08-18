package com.alexrebello.azureartifactapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AzureArtifactAppApplication

fun main(args: Array<String>) {
    runApplication<AzureArtifactAppApplication>(*args)
}
