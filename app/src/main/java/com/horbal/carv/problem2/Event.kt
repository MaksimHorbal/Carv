package com.horbal.carv.problem2

sealed interface Event {

    object Bluetooth : Event

    data class Temperature(val value: Float) : Event

    data class Accelerometer(val data: Any) : Event
}