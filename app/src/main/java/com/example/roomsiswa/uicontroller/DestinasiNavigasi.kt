package com.example.roomsiswa.uicontroller

interface DestinasiNavigasi {
    //nama unik utk menentukan jalur utk composable
    val route: String

    //String res id yang berisi judul yg akan ditampilkan di layar halaman
    val titleRes: Int
}