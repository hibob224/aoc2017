package day04

import java.io.File

/**
 * Created by Jonny on 05/12/2017.
 */
fun main(args: Array<String>) {
    println("Part One: ${validPassphrasesPartOne()}")
    println("Part Two: ${validPassphrasesPartTwo()}")
}

fun validPassphrasesPartOne(): Int = getLines().map { it.split(" ") }.count { it.size == it.distinct().size }

fun validPassphrasesPartTwo(): Int = getLines().map { it.split(" ").map { it.toCharArray().sorted().toCharArray().joinToString() } }.count { it.size == it.distinct().size }

fun getLines(): List<String> = File("src/day04/input.txt").readLines()