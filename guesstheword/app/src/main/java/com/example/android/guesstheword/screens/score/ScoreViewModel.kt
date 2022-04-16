package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(var finalScore: Int) : ViewModel() {

    val score =  MutableLiveData<Int>()

    private val _playAgainEvent = MutableLiveData<Boolean>()
    val playAgainEvent : LiveData<Boolean>
        get() = _playAgainEvent


    init {
        Log.i("ScoreViewModel", "Final Score: $finalScore")
        _playAgainEvent.value = false
        score.value = finalScore

    }

    fun playAgain() {
        _playAgainEvent.value = true
    }

    fun onPlayAgainComplete() {
        _playAgainEvent.value = false
    }

}