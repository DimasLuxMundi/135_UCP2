package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ucp2.data.FormUISTate

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanDua(
    orderUIState: FormUISTate,
    pilihanDosen: List<String>,
    onSelectionChanged: (String) -> Unit,



    ){

    var namaText by rememberSaveable {
        mutableStateOf("")
    }
    var nimText by rememberSaveable {
        mutableStateOf("")
    }
    var konsenText by rememberSaveable {
        mutableStateOf("")
    }
    var judulText by rememberSaveable {
        mutableStateOf("")
    }
    var dospem1 by rememberSaveable {
        mutableStateOf("")
    }
    var dospem2 by rememberSaveable {
        mutableStateOf("")
    }

    var listData: MutableList<String> = mutableListOf(namaText, nimText , konsenText, judulText)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Formulir Pengajuan Skripsi", fontWeight = FontWeight.Bold, fontSize = 25.sp)
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = namaText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.namaUser)) },
                onValueChange = {namaText = it}
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = nimText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.nimUser)) },
                onValueChange = {nimText = it}
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = konsenText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.konsenUser)) },
                onValueChange = {konsenText = it}
            )


            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = judulText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.judulUser)) },
                onValueChange = {judulText = it}
            )
            Spacer(modifier = Modifier.padding(10.dp))

            pilihanDosen.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = dospem1 == item,
                    onClick = {
                        dospem1 = item
                        onSelectionChanged(item)
                    }
                ),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = dospem1 == item,
                        onClick = {
                            dospem1 = item
                            onSelectionChanged(item)
                        }
                    )
                    Text(item)
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            pilihanDosen.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = dospem2 == item,
                    onClick = {
                        dospem2 = item
                        onSelectionChanged(item)
                    }
                ),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = dospem2 == item,
                        onClick = {
                            dospem2 = item
                            onSelectionChanged(item)
                        }
                    )
                    Text(item)
                }
            }


        }
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

            Button(onClick = {}) {
                Text(text = stringResource(id = R.string.submit_Button))
            }
        }
    }
}