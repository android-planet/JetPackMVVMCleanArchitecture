package com.medisage.smart_mr

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
   Column(modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally) {
      Image(painter = painterResource(id = R.mipmap.smart_mr_logo), contentDescription = "image", modifier =
      Modifier.size(140.dp))


      Box(
         modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, top = 10.dp, end = 30.dp, bottom = 10.dp)
            .height(56.dp) // Desired height for the text field
      ) {
         OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter Username") },
            modifier = Modifier
               .fillMaxSize(), // Ensure it respects the container's size
            singleLine = true,
            textStyle = TextStyle(fontSize = 12.sp),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors()
         )
      }

      Spacer(modifier = Modifier.height(10.dp)) // Optional spacing between fields

      Box(
         modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, top = 10.dp, end = 30.dp, bottom = 10.dp)
            .height(56.dp)
      ) {
         OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter Password") },
            modifier = Modifier
               .fillMaxSize(),
            singleLine = true,
            textStyle = TextStyle(fontSize = 12.sp),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors()
         )
      }
      Spacer(modifier = Modifier.height(15.dp)) // Optional spacing between fields

      Button(modifier = Modifier
         .fillMaxWidth()
         .height(60.dp)
         .padding(start = 30.dp, top = 10.dp, end = 30.dp, bottom = 10.dp),
         onClick = { /*TODO*/ }) {

      }

   }

}