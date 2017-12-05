package day03

/**
 * Created by Jonny on 04/12/2017.
 */
fun main(args: Array<String>) {
    solvePartOne()

}

fun solvePartOne() {
    val grid: HashMap<Int, String> = hashMapOf()
    var x = 0
    var y = 0
    var dist = 1
    var index = 2
    var direction = 'e'

    for (c in 1..1024) { // Create a huge spiral
        for (i in 1..2) { // Use same distance for two sides for spiral effect
            for (l in 1..dist) { // Add all indexes on side
                when (direction) {
                    'e' -> x++
                    'n' -> y++
                    'w' -> x--
                    's' -> y--
                }
                grid.put(index, "$x,$y")
                index++
            }
            direction = when (direction) { // New direction
                'e' -> 'n'
                'n' -> 'w'
                'w' -> 's'
                's' -> 'e'
                else -> throw IllegalStateException()
            }
        }
        dist++
    }
    println("361527: ${grid[361527]}")
}

fun solvePartTwo() {

}