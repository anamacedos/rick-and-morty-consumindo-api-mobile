package br.senai.sp.jandira.rick_morty_api.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.rick_morty_api.R
import br.senai.sp.jandira.rick_morty_api.model.Character
import br.senai.sp.jandira.rick_morty_api.screens.HomeScreen
import coil.compose.AsyncImage

@Composable

fun CharacterCard(
    name: String = "Sem nome",
    species: String = "Species",
    status: String = "Status",
    image: String
){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
            .padding(bottom = 8.dp)

    ){
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card (
                modifier = Modifier
                    .size(100.dp)
                    .padding(start = 16.dp),
                shape = CircleShape,

            ){
                AsyncImage(
                    model = image,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(text = name, fontSize = 20.sp)
                Text(text = species)
                Text(text = status)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CharacterCardPreview(){
    CharacterCard(
        name = "Character's name",
        species = "Human",
        status = "Alive",
        image = ""

    )
}
