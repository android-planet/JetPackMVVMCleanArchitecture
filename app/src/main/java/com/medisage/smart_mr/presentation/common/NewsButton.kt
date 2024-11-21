package com.medisage.smart_mr.presentation.common

import android.content.res.Configuration
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.medisage.smart_mr.R
import com.medisage.smart_mr.presentation.onboardinng.components.OnBoardingPage
import com.medisage.smart_mr.presentation.onboardinng.pages
import com.medisage.smart_mr.ui.theme.SmartMRTheme
import org.w3c.dom.Text

@Composable
fun NewsButton(
    text: String,
    onClick:() -> Unit
){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White,

    ),
        shape = RoundedCornerShape(size = 6.dp)
    ) {
        Text(text = text, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold))
    }

}

@Composable
fun NewsTextButton(
    text: String,
    onClick:() -> Unit
){
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = colorResource(id = R.color.shimmer))
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,showBackground = true)
@Composable
fun OnBoardingPagePreview(){
    SmartMRTheme {
        //NewsButton("Swapnil", onClick = )
    }
}
