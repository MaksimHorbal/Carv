package com.horbal.carv.problem3

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlin.time.Duration.Companion.seconds

class Device {

    fun isConnected(): Flow<Boolean> = flow {
        var counter = 0
        while (true) {
            emit(counter)
            delay(1.seconds)
            counter++
        }
    }
        .map { counter ->
            when {
                counter % 5 == 0 -> true
                counter % 3 == 0 -> false
                else -> null
            }
        }
        .filterNotNull()
        .distinctUntilChanged()
        .flatMapLatest { isConnected ->
            if (isConnected) {
                flowOf(true)
            } else {
                flow {
                    delay(3.5.seconds)
                    emit(false)
                }
            }
        }
        .distinctUntilChanged()
}