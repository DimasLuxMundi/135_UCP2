package com.example.ucp2.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.ucp2.R

@Composable
fun FormatDataBio(
    namaData: String,
    nimData: String,
    konsenData: String,
    judulata: String,
    ){
    Text(
        text = stringResource(R.string.namaUser),
    )
    Text(namaData)
    Divider()
    Spacer(modifier = Modifier.padding(5.dp))


    Text(
        text = stringResource(R.string.nimUser),
    )
    Text(nimData)
    Divider()
    Spacer(modifier = Modifier.padding(5.dp))


    Text(
        text = stringResource(R.string.konsenUser),
    )
    Text(konsenData)
    Spacer(modifier = Modifier.padding(5.dp))
    Divider()

    Text(
        text = stringResource(R.string.judulUser),
    )
    Text(judulata)
    Spacer(modifier = Modifier.padding(5.dp))
    Divider()


}

