import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {

        val listA = input
            .map { it.split("\\s+".toRegex())[0].toInt() }
            .sorted()

        val listB = input
            .map { it.split("\\s+".toRegex())[1].toInt() }
            .sorted()

        return listA
            .zip(listB)
            .map { (a, b) -> a - b }
            .sumOf { abs(it) }
    }

    fun part2(input: List<String>): Int {
        val listA = input
            .map { it.split("\\s+".toRegex())[0].toInt() }

        val listB = input
            .map { it.split("\\s+".toRegex())[1].toInt() }


        return listA.sumOf { itemA -> listB.filter { it == itemA }.size * itemA }
    }

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 11)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
