package com.example.android.guesstheword.screens.viewModel.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {


    private var _score = MutableLiveData<String>()
    val score: LiveData<String>
        get() = _score

    init {
        _score.postValue(finalScore.toString())
        Log.i("ScoreViewModel", "ScoreViewModel: $finalScore ")
    }
}