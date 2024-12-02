package d1

import utils.getLines
import kotlin.math.abs

fun p1() {
    val lines = getLines("/src/d1/p1.txt")
    val lNums = ArrayList<Int>()
    val rNums = ArrayList<Int>()
    var diff = 0

    lines.forEach {
        val nums = it.split("   ")

        val lNum = nums[0].toInt()
        val rNum = nums[1].toInt()

        lNums.add(lNum)
        rNums.add(rNum)
    }

    lNums.sort()
    rNums.sort()

    lNums.forEachIndexed { index, num -> diff += abs(num - rNums[index]) }

    println(diff)
}

fun p2() {
    val lines = getLines("/src/d1/p2.txt")
    val lNums = ArrayList<Int>()
    val mults = HashMap<Int, Int>()

    lines.forEach {
        val nums = it.split("   ")

        val lNum = nums[0].toInt()
        val rNum = nums[1].toInt()

        lNums.add(lNum)
        mults[rNum] = mults.getOrDefault(rNum, 0) + 1
    }

    val score = lNums.fold(0) { acc, num -> acc + num * mults.getOrDefault(num, 0) }

    println(score)
}
