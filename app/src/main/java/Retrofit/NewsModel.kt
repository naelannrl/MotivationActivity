//package Retrofit

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch
import kotlin.math.log

//class NewsModel:ViewModel() {
//    fun getTopHeadLines() {
//        viewModelScope.launch {
//            val response = NewsApi.retrofitService.getTopHeadLine()
//            log.d("response", response)
//        }
//    }
//}