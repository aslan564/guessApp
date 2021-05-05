package com.example.android.guesstheword.screens.score.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.guesstheword.screens.score.ScoreFragment
import com.example.android.guesstheword.screens.viewModel.score.ScoreViewModel

class ScoreViewModelFactory(private val finalScore: Int): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            return ScoreViewModel(finalScore) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}