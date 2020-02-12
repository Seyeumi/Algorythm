fun stopwatch(body: () -> Unit): Double {
    val nanos = System.nanoTime()
    body()
    val elapsed = System.nanoTime() - nanos
    return elapsed.toDouble()/1_000_000.0
}

val time = stopwatch {
Thread.sleep(1000)
}
println(time_millisecond)

