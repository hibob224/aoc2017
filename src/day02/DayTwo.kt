package day02

import utils.combinations
import java.io.File

/**
 * Created by Jonny on 04/12/2017.
 */
fun main(args: Array<String>) {
    println("Part One: ${solvePartOne()}")
    println("Part Two: ${solvePartTwo()}")
}

fun solvePartOne(): Int {
    var sum = 0
    File("src/day02/input.txt").readLines().map {
        line -> line.split("\t")
    }.forEach {
        it.map { it.toInt() }.sorted().let { // Map each value to an int, sort the list
            sum += (it.last() - it.first())
        }
    }
    return sum
}

fun solvePartTwo(): Int {
    var sum = 0
    File("src/day02/input.txt").readLines().map {
        line -> line.split("\t")
    }.forEach {
        it.map { it.toInt() }.let { // Map each value to an int
            it.combinations().forEach {
                if ((it.first % it.second) == 0) {
                    sum += it.first / it.second
                }
            }
        }
    }
    return sum
}