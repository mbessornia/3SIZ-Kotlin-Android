package br.com.fiap.ludoboardgames.model

data class BoardGame(
    val title: String,
    val gamesPublisher: List<GamePublisher>
)