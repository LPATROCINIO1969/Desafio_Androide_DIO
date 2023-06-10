package br.com.luciopp.desafio_android_dio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.TypedArrayUtils.getText
import br.com.luciopp.desafio_android_dio.ui.theme.Desafio_Android_DIOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Desafio_Android_DIOTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(stringResource(R.string.saudacao_text), stringResource(R.string.identificacao_text))
                }
            }
        }
    }
}


@Composable
fun Greeting(message: String, name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable._eb61c81f031514445061c98b2e18e16)
    Box {
        Image(painter = image,contentDescription = null,
            modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Text(
                text = "$message $name",
                fontSize = 28.sp,
                color = Color.Blue,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all=16.dp)
                    .wrapContentWidth(align = Alignment.CenterHorizontally)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )

        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Desafio_Android_DIOTheme {
        Greeting(stringResource(R.string.saudacao_text), stringResource(R.string.identificacao_text))
    }
}