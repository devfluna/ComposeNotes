package com.example.mynotes.ui.screens.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.mynotes.ui.screens.NotesScreen
import com.example.mynotes.ui.screens.RemindersScreen
import com.example.mynotes.ui.theme.MyNotesTheme
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SwipeTabLayout(onSwipeOrClicked: (Int) -> Unit) {
    val pagerState = rememberPagerState(pageCount = 2)

    Column(modifier = Modifier.background(MaterialTheme.colors.background)) {

        SwipeTab(
            pagerState = pagerState,
            onTabClick = onSwipeOrClicked
        )

        TabContent(
            pagerState = pagerState,
            onTabSwipe = onSwipeOrClicked
        )
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SwipeTab(
    pagerState: PagerState,
    onTabClick: (Int) -> Unit
) {
    val tabList = TabItems().getTabItems()
    val scope = rememberCoroutineScope()

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = MaterialTheme.colors.primary,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = Color.White
            )
        }
    ) {
        tabList.forEachIndexed { index, tabItem ->

            Tab(
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                        onTabClick(pagerState.currentPage)
                    }
                },
                text = { Text(text = tabItem.title) },
                icon = { Icon(imageVector = tabItem.icon, contentDescription = null) }
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabContent(pagerState: PagerState, onTabSwipe: (Int) -> Unit) {
    onTabSwipe(pagerState.currentPage)

    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> NotesScreen()
            1 -> RemindersScreen()
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview
@Composable
fun SwipeTabPreview() {
    MyNotesTheme {
        SwipeTab(pagerState = rememberPagerState(pageCount = 2), onTabClick = {})
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(name = "Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SwipeTabPreviewDark() {
    MyNotesTheme {
        SwipeTab(pagerState = rememberPagerState(pageCount = 2), onTabClick = {})
    }
}