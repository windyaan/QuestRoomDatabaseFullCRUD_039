package com.example.roomsiswa.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repositori.RepositoriSiswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
   //berisi status siswa saat ini
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
       private set


}