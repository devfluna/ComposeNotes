package com.example.mynotes.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mynotes.data.repositories.MyRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: MyRepo
) : ViewModel() {

    private var _selectedTab = MutableStateFlow(0)
    val selectedTab: StateFlow<Int> = _selectedTab

    fun setScreenFromPagerState(currentPage: Int) {
        _selectedTab.value = currentPage
    }
}