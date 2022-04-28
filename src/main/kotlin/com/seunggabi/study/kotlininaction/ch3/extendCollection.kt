package com.seunggabi.study.kotlininaction.ch3

fun main(args: Array<String>) {
    val strings: List<String> = listOf("first", "second", "fourteenth")

    println(strings.last())
    val numbers: Collection<Int> = setOf(1, 14, 2)
//    numbers.max()

    val list = listOf(2, 3, 5, 7, 11)
    val list2 = listOf("args: ", *args)
    println(list)
    println(list2)

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    1.to("one")

    infix fun Any.to(other: Any) = Pair(this, other)

    val (number, name) = 1 to "one"

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    fun parsePath(path: String) {
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")
        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        println("Dir: $directory, name: $fileName, ext: $extension")
    }
    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    fun parsePath2(path: String) {
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if (matchResult != null) {
            val (directory, fileName, extension) = matchResult.destructured
            println("Dir: $directory, name: $fileName, ext: $extension")
        }
    }
    parsePath2("/Users/yole/kotlin-book/chapter.adoc")
}