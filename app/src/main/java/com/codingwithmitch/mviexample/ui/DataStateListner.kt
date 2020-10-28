package com.codingwithmitch.mviexample.ui

import com.codingwithmitch.mviexample.util.DataState

interface DataStateListner {
    fun onDataStateChange(dataState: DataState<*>?)
}