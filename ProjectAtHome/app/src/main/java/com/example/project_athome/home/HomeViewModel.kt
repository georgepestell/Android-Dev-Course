package com.example.project_athome.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(){

    private val _navigateToPubQuiz = MutableLiveData<Boolean>()
    val navigateToPubQuiz : LiveData<Boolean>
        get() = _navigateToPubQuiz

    fun navigateToPubQuiz() {
        _navigateToPubQuiz.value = true
    }

    fun doneNavigatingToPubQuiz() {
        _navigateToPubQuiz.value = null
    }

}