package com.example.grocerydelivery.screens

import android.support.v4.os.IResultReceiver
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grocerydelivery.R

@Composable
fun Delivery(
    onNext:()->Unit
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround) {
        Image(painter = painterResource(id = R.drawable.fruit_intro_logo), contentDescription ="" , modifier = Modifier
            .clip(
                CircleShape
            )
            .size(360.dp), contentScale = ContentScale.Crop)
        
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = stringResource(R.string.Onboarding_Title), fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text(text = "Yourn Home", fontWeight = FontWeight.ExtraBold, fontSize = 24.sp, color = MaterialTheme.colors.primary)

        }

        Text(text = "online grocery shopping helps you to get grocery at your door step",  fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 6.dp), fontStyle = FontStyle.Italic, textAlign = TextAlign.Center
        )
        IconButton(onClick = onNext, modifier = Modifier.clip(CircleShape).background(MaterialTheme.colors.primary)) {
         Icon(Icons.Default.ArrowForward, contentDescription = "", tint = MaterialTheme.colors.onPrimary    )
        }
    
    }
    
}


