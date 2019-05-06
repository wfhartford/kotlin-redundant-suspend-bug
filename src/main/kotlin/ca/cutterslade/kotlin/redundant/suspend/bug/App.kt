package ca.cutterslade.kotlin.redundant.suspend.bug

import kotlinx.coroutines.runBlocking

fun main() {
  runBlocking {
    readAll(::handleBytes)
  }
}

suspend fun handleBytes(byte: Byte) {
  // Imagine some suspending implementation here
  println(byte)
}

suspend fun readAll(sink: suspend (Byte) -> Unit) {
  for (i in 1..10) {
    read(sink)
  }
}

suspend inline fun read(sink: suspend (Byte) -> Unit) = sink(0xff.toByte())
