package com.example.navegacao1.ui.telas

import android.widget.Toast
<<<<<<< HEAD
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
=======
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
>>>>>>> origin/master
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
<<<<<<< HEAD
=======
import androidx.compose.ui.text.font.FontWeight
>>>>>>> origin/master
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.navegacao1.model.dados.UsuarioDAO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

val usuarioDAO: UsuarioDAO = UsuarioDAO()

@Composable
<<<<<<< HEAD
fun TelaLogin(modifier: Modifier = Modifier, onSigninClick: () -> Unit,  onSignupClick: () -> Unit ) {
=======
fun TelaLogin(modifier: Modifier = Modifier, onSigninClick: () -> Unit, onSignupClick: () -> Unit ) {
>>>>>>> origin/master
    val context = LocalContext.current
    var scope = rememberCoroutineScope()

    var login by remember {mutableStateOf("")}
    var senha by remember {mutableStateOf("")}
    var mensagemErro by remember { mutableStateOf<String?>(null) }
<<<<<<< HEAD
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxWidth()) {
=======
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tela Login",
            fontWeight = FontWeight.Bold
        )
>>>>>>> origin/master
        OutlinedTextField(value = login, onValueChange = {login = it}, label = { Text(text = "Login")})
        Spacer(modifier =  Modifier.height(10.dp))
        OutlinedTextField(value = senha, visualTransformation = PasswordVisualTransformation(),
            onValueChange = {senha = it}, label = { Text(text = "Senha")})
<<<<<<< HEAD
        Button(modifier = Modifier.fillMaxWidth(), onClick = {
=======

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            onClick = {
>>>>>>> origin/master
            scope.launch(Dispatchers.IO) {
                usuarioDAO.buscarPorNome(login, callback = { usuario ->
                    if (usuario != null && usuario.senha == senha) {
                        onSigninClick()
                    } else {
                        mensagemErro = "Login ou senha inválidos!"
                    }
                })
            }
        }) {
            Text("Entrar")
        }
<<<<<<< HEAD
        Button(modifier = Modifier.fillMaxWidth(), onClick = onSignupClick) {
=======

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            onClick = onSignupClick) {
>>>>>>> origin/master
            Text("Cadastrar")
        }

        mensagemErro?.let {
            LaunchedEffect(it) {
                Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                mensagemErro = null
            }
        }
    }

}