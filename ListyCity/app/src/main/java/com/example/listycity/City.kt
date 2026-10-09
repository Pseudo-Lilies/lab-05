package com.example.listycity

import com.google.firebase.firestore.DocumentSnapshot

data class City(
    val name: String = "",
    val province: String = "",
    val id: String = name
) {
    constructor(document: DocumentSnapshot) : this(document.data!!["name"].toString(), document.data!!["province"].toString(), document.id)
}
