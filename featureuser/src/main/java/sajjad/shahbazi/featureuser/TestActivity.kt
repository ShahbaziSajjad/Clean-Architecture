package sajjad.shahbazi.featureuser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent



class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesNavHost()
        }
    }
}




