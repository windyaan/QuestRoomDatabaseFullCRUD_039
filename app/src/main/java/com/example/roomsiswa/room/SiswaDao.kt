package com.example.roomsiswa.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
// kelas abstract- tanpa implmeentasi(isi perintah)
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa():Flow<List<Siswa>>

    //Edit : tambah 3 fungsi
    @Query("SELECT * from tblSiswa WHERE id = :id")
    fun getSiswa(id: Int):Flow<Siswa>

    @Update
    suspend fun update(siswa: Siswa)

    @Delete
    suspend fun delete(siswa: Siswa)
}