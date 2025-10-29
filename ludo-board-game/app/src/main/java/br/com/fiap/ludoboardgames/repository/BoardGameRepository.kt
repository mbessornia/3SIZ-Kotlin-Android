package br.com.fiap.ludoboardgames.repository

import android.icu.text.CaseMap.Title
import br.com.fiap.ludoboardgames.model.BoardGame
import br.com.fiap.ludoboardgames.model.GamePublisher

fun getAllBoardGames(): List<BoardGame> {
    return listOf(
        BoardGame("Azul", listOf(Asmodee)),
        BoardGame(
            "Ticket To Ride",
            listOf(Asmodee)
        ),
        BoardGame(
            "Quem Foi?",
            listOf(PaperGames)
        ),
    )
}

fun getBoardGameBy(gamePublisher: GamePublisher): List<BoardGame> {
    return getAllBoardGames().filter {
        it.gamesPublisher.contains(gamePublisher)
    }
}

fun getBoardGameBy(title: String): List<BoardGame> {
    return getAllBoardGames().filter {
        it.title.startsWith(prefix = title, ignoreCase = true)
    }
}