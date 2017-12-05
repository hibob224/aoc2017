package utils

import java.util.*

// Reusable extensions
fun <T> List<T>.combinations(): ArrayList<Pair<T, T>> {
    val list = arrayListOf<Pair<T, T>>()
    forEachIndexed { indexOuter, valueOuter ->
        forEachIndexed { indexInner, valueInner ->
            if (indexOuter != indexInner) {
                list.add(Pair(valueOuter, valueInner))
            }
        }
    }
    return list
}