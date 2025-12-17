package com.example.shoppingapp.presentation

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp.R
import com.example.shoppingapp.presentation.Utils.CustomTextField

@Composable
fun LoginScreen() {

    val context = LocalContext.current

    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Login",
            fontSize = 24.sp,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(Alignment.Start)
        )

        CustomTextField(
            value = email,
            onValueChange = { email = it },
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )
        Spacer(modifier = Modifier.padding(8.dp))

        CustomTextField(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
        )

        Spacer(modifier = Modifier.padding(4.dp))

        Text(
            text = "Forgot Password?",
            modifier = Modifier.align(Alignment.End)
        )

        Spacer(modifier = Modifier.padding(16.dp))

        Button(
            onClick = {
                if (email.isNotEmpty() && password.isNotEmpty()) {
                    //Verify the user credentials
                    Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Please fill all the fields", Toast.LENGTH_SHORT).show()
                }

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.orange))
        ) {
            Text(text = "Login", color = Color.White)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            androidx.compose.material.Text("Don't have an account?")
            Spacer(modifier = Modifier.size(8.dp))
            TextButton(onClick = {//navigate to login screen
            }) {
                androidx.compose.material.Text("SignUp", color = colorResource(id = R.color.orange))
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalDivider(modifier = Modifier.weight(1f))
            androidx.compose.material.Text("OR", modifier = Modifier.padding(horizontal = 8.dp))
            HorizontalDivider(modifier = Modifier.weight(1f))


        }

        OutlinedButton(
            onClick = {},

            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            shape = RoundedCornerShape(8.dp),

            ) {
            Image(
                painter = painterResource(id = R.drawable.google_logo),
                contentDescription = "null",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.size(8.dp))
            androidx.compose.material.Text(
                "Sign Up with Google",
                color = colorResource(id = R.color.black)
            )


        }
    }
}