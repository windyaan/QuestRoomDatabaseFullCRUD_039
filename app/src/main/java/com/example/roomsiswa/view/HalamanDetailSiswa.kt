package com.example.roomsiswa.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roomsiswa.R
import com.example.roomsiswa.uicontroller.DestinasiNavigasi
import com.example.roomsiswa.uicontroller.SiswaTopAppBar
import com.example.roomsiswa.viewmodel.DetailViewModel
import com.example.roomsiswa.viewmodel.PenyediaViewModel

object DestinasiDetailSiswa :DestinasiNavigasi{
    override val route = "detail_siswa"

    override val tittleRes = "Detail Siswa"

    const val itemArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailSiswaScreen (
    navigateToEditItem: (Int) -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DetailViewModel = viewModel(factory =
    PenyediaViewModel.Factory)
){
    Scaffold(
        topBar = {
            SiswaTopAppBar(
                title = stringResource(R.string.detail_siswa),
                canNavigateBack = true,
                navigateUp = navigateBack
            )
        },

        floatingActionButton = {
            val uiState = viewModel.uiDetailState.collectAsState()
            FloatingActionButton(
                onClick = {
                    navigateToEditItem(
                        uiState.value.detailSiswa.id
                    )
                },
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier .padding(dimensionResource(R.dimen.padding_large))
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = stringResource(R.string.update)
                )
            }
        }, modifier = modifier
    ){ innerPaddng ->
        val uiState = viewModel.uiDetailState.collectAsState()
        va
    }
}