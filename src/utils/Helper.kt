package utils

import java.io.File
import java.nio.file.Paths

fun getLines(relPath: String): List<String> {
    val projDir = Paths.get("").toAbsolutePath().toString()
    val filePath = Paths.get(projDir, relPath)
    val file = File(filePath.toUri())

    return file.useLines {it.toList()}
}