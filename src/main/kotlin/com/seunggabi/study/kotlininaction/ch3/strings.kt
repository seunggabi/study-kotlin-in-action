@file:JvmName("StringFunctions")

package strings

fun String.lastChar(): Char = get(length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
