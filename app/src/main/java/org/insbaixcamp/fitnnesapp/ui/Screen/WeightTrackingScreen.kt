package org.insbaixcamp.fitnnesapp.ui.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.insbaixcamp.fitnnesapp.tools.CalcularIMC
import org.insbaixcamp.fitnnesapp.ui.theme.FitnnesAppTheme


@Composable
fun WeightTrackingScreen (
    pesActual : Double,
    pesObjectiu : Double,
    alçada: Int
){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.padding(top = 16.dp)){
            Card(Modifier.weight(1f).padding(8.dp)){
                Text("pes actual")
                Text("$pesActual Kg")
            }
            Card(Modifier.weight(1f).padding(8.dp)){
                Text("pes objectiu")
                Text("$pesObjectiu Kg")
            }
            Card(Modifier.weight(1f).padding(8.dp)){
                Text("IMC")
                var imc = CalcularIMC.calcularIMC(pesActual, alçada)
                Text(imc.toString())
            }
        }
    }



}

@Preview(showBackground = true)
@Composable
fun WeightTrackingScreenPreview() {
    FitnnesAppTheme() {
        WeightTrackingScreen(
            pesActual = 75.0,
            pesObjectiu = 70.0,
            alçada = 175
        )
    }
}