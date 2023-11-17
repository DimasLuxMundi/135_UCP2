package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.ucp2.data.FormUISTate
import com.example.ucp2.ui.component.FormatDataBio

@Composable
fun HalamanTiga(
    formState: FormUISTate,
    modifier: Modifier = Modifier,

    ){
    val items = listOf(
        Pair(stringResource(R.string.dosen1), formState.dosen),
        Pair(stringResource(R.string.dosen2), formState.dosen2)
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            FormatDataBio(
                namaData = formState.nama,
                nimData = formState.nim,
                konsenData = formState.konsen,
                judulata = formState.judul
            )

            Spacer(modifier = Modifier.padding(8.dp))
            items.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(
                        text = item.second.toString(), fontWeight =
                        FontWeight.Bold
                    )
                }
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
            }
            Spacer(modifier = Modifier.padding(8.dp))

        }
        Row(
            modifier = Modifier
                .weight(1f, false)
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
            ) {

                OutlinedButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {}
                ) {
                    Text(stringResource(R.string.back_Button))

                }
            }
        }
    }
}