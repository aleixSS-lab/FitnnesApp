package org.insbaixcamp.fitnnesapp.tools

import kotlin.math.round

class CalcularIMC {
    companion object {
        fun calcularIMC(pesActual: Double, alçada: Int): Double {
            var alçadaMetres = alçada.toDouble()/100
            return round(pesActual / (alçadaMetres * alçadaMetres)*100)/100
        }
    }
}