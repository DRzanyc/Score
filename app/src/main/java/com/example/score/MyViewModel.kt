package com.example.score

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author: Liu
 * @date: 2021/10/8
 */

class MyViewModel : ViewModel() {
     val aTeamScore: MutableLiveData<Int> by lazy {
         MutableLiveData<Int>() .also {
            it.value = 0
        }
    }
     val bTeamScore: MutableLiveData<Int> by lazy {
         MutableLiveData<Int>() .also {
            it.value = 0
        }
    }

    private var aBack: Int = 0
    private var bBack: Int = 0

    fun aTeamAdd(p: Int) {
        aBack = aTeamScore.value!!
        bBack = bTeamScore.value!!
        aTeamScore.value = aTeamScore.value?.plus(p)
    }

    fun bTeamAdd(p: Int) {
        aBack = aTeamScore.value!!
        bBack = bTeamScore.value!!
        bTeamScore.value = bTeamScore.value?.plus(p)
    }

    fun reset() {
        aBack = aTeamScore.value!!
        bBack = bTeamScore.value!!
        aTeamScore.value = 0
        bTeamScore.value = 0
    }

    fun undo() {
        aTeamScore.value = aBack
        bTeamScore.value = bBack
    }
}
