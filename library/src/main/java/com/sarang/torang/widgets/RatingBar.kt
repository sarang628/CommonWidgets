package com.sarang.torang.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.sarang.torang.R

@Composable
fun RatingBar(rating: Float) {
    var _rating = rating
    if (_rating > 5) {
        _rating = 5f
    }



    Row {
        for (f in 1.._rating.toInt()) {
            Image(
                painter = painterResource(id = R.drawable.selected_star),
                contentDescription = "",
                Modifier
                    .size(Dp(15f))
                    .padding(start = Dp(2f))
            )
        }
        if (_rating - _rating.toInt() >= 0.5f) {
            Image(
                painter = painterResource(id = R.drawable.half_star),
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
    RatingBar(rating = 2.5f)
}