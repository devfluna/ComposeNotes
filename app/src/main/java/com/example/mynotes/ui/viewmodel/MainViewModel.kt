package com.example.mynotes.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mynotes.data.repositories.MyRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: MyRepo
) : ViewModel() {

    private var _dialogState: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val dialogState: StateFlow<Boolean> = _dialogState.asStateFlow()

    private var selectedTab = 0

    fun onAddButtonClicked() {
        if (selectedTab == 0) setDialogState(true)
    }

    fun setScreenFromPagerState(currentPage: Int) {
        this.selectedTab = currentPage
    }

    fun setDialogState(state: Boolean) {
        _dialogState.value = state
    }
}