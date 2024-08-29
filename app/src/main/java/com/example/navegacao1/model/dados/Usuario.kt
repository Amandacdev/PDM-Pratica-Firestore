package com.example.navegacao1.model.dados

import com.google.firebase.firestore.DocumentId


data class Usuario(
    @DocumentId
    val id: String? = null,
    val nome: String = "",
    val senha: String = "",
    val descricao: String = ""
)