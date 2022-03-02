package com.matthiasbruns.backend.game

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController {

    @GetMapping("")
    fun getAll(): List<String> = listOf("game1", "game2")
}