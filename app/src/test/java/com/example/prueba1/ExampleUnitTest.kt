package com.example.prueba1

import org.junit.Test
import org.junit.Assert.assertEquals

class ExampleUnitTest {

    @Test
    fun testViewModelInitialization() {
        val viewModel = ComparadorViewModel()

        // probando los valores del inicio
        assertEquals("Resultado:", viewModel.text0.value)
        assertEquals(null, viewModel.text1.value)
        assertEquals(null, viewModel.text2.value)
        assertEquals(null, viewModel.resultText.value)
    }
}






