package com.example.ucp2

import androidx.lifecycle.ViewModel
import com.example.ucp2.data.FormUISTate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel1:ViewModel() {
    private val _stateUI = MutableStateFlow((FormUISTate()))
    val stateUI: StateFlow<FormUISTate> = _stateUI.asStateFlow()

    fun setBio(list: MutableList<String>){
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(
            nama = list[0],
            nim = list[1],
            konsen = list[2],
            judul = list[3]
        ) }
    }



    fun setDosen1(dosenPilihan1: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dosen = dosenPilihan1) }

    }
    fun setDosen2(dosenPilihan2: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dosen2 = dosenPilihan2) }

    }

    fun resetOrder() {
        _stateUI.value = FormUISTate()
    }


}