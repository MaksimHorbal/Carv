package com.horbal.carv.problem2

import kotlin.reflect.KClass

class Messenger {

    private val subscribers = mutableMapOf<KClass<*>, MutableList<(Event) -> Unit>>()

    fun publish(event: Event) {
        subscribers[event::class]?.forEach { callback -> callback(event) }
    }

    inline fun <reified T : Event> subscribe(noinline callback: (T) -> Unit) {
        subscribe(T::class, callback)
    }

    fun <T : Event> subscribe(key: KClass<T>, callback: (T) -> Unit) {
        subscribers.getOrPut(key) { mutableListOf() }.add(callback as (Event) -> Unit)
    }
}