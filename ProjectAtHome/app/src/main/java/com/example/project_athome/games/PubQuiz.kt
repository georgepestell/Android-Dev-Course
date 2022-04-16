package com.example.project_athome.games

class PubQuiz() {

    data class Question(
        val text: String,
        val value: List<String>
    )

    private var questions : List<Question> = listOf(
        Question("Whats The Charge?", listOf("Nothing", "Noone")),
        Question("How's it hanging?", listOf("well", "shit")),
    )

}