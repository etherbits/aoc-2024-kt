import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size != 3){
        println("usage: ")
        exitProcess(1)
    }

    val q = "${args[1]}-${args[2]}"

    when (q){
        "1-1" -> {
            println("Running 1 1")
            d1.p1()
        }
        "1-2" -> {
            println("Running 1 2")
            d1.p2()
        }
        else -> println("No such solution")
    }
}