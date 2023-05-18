package com.example.library

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

@Composable
fun RatingBar(rating: Float) {
    Row {
        for (f in 0..rating.toInt()) {
            Image(
                painter = painterResource(id = R.drawable.selected_star),
                contentDescription = "",
                Modifier
                    .size(Dp(15f))
                    .padding(start = Dp(2f))
            )
        }
    }
}

@Preview
@Composable
fun PreviewRatingBar() {
    RatingBar(rating = 3.5f)
}