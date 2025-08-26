package com.example.roomsiswa.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomsiswa.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        //edit : tambah initializer Detail dan Edit
        initializer {
            DetailViewModel(this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EditViewModel(this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

//fungsi ekstensi query untuk objek
fun CreationExtras.aplikasiSiswa():AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)