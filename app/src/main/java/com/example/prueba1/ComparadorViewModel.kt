package com.example.prueba1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class ComparadorViewModel : ViewModel() {
    val text0 = MutableLiveData<String>("Resultado:")
    var text1 = MutableLiveData<String>()
    var text2 = MutableLiveData<String>()
    var resultText = MutableLiveData<String>()


    fun compareTexts() {

        text0.value = "Resultado:"

        val input1 = text1.value ?: ""
        val input2 = text2.value ?: ""

        if (text1.value == text2.value) {
            text0.value = " Las cadenas de caracteres son iguales."


        } else {
            text0.value = " Las cadenas de caracteres son diferentes."
        }

        resultText.value = text0.value
    }
}

