package com.matthiasbruns.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlaytBackendApplication

fun main(args: Array<String>) {
    runApplication<PlaytBackendApplication>(*args)
}
