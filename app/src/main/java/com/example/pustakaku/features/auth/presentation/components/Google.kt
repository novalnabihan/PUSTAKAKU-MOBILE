//package com.example.pustakaku.features.auth.presentation.components
//
//import android.util.Log
//import androidx.activity.compose.rememberLauncherForActivityResult
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.LocalLifecycleOwner
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.google.android.gms.auth.api.signin.GoogleSignIn
//import com.google.android.gms.auth.api.signin.GoogleSignInAccount
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions
//import com.google.android.gms.common.api.Api
//import com.google.android.gms.common.api.ApiException
//import com.example.pustakaku.R
////import com.example.pustakaku.ui.theme.publicSansFontFamily
//import okhttp3.internal.concurrent.Task
//
//@Composable
//fun GoogleSignInButton(onSignInResult: (GoogleSignInAccount?) -> Unit){
//    val context = LocalContext.current
//
//    val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//        .requestIdToken(context.getString(R.string.web_client_id))
//        .requestEmail()
//        .build()
//
//    val googleSignInClient = GoogleSignIn.getClient(context, googleSignInOptions)
//
//    val signInLauncher = rememberLauncherForActivityResult(
//        contract = ActivityResultContracts.StartActivityForResult()
//    ) { result ->
//        val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
//        try {
//            val account = task.getResult(ApiException::class.java)
//            onSignInResult(account)
//        } catch (e: ApiException){
//            Log.w("GoogleSignIn", "signInResult:failed code=" + e.statusCode)
//            onSignInResult(null)
//        }
//    }
//
//    Button(
//        modifier = Modifier.fillMaxWidth(),
//        colors = ButtonDefaults.buttonColors(Color.White),
//        border = BorderStroke(1.dp, Color.Black),
//        shape = RoundedCornerShape(5.dp),
//        onClick = {
//            signInLauncher.launch(googleSignInClient.signInIntent)
//        }
//    ){
//        Text(
//            text = "SignIn With Google",
//            fontSize = 12.sp,
////            fontFamily = publicSansFontFamily,
//            fontWeight = FontWeight.Medium,
//            color = Color.Black
//        )
//    }
//}