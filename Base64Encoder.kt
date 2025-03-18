import java.util.Base64
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {


    val inputFile = "/data/Git/winutils/hadoop-3.1.1/bin/winutils.exe"
    val outputFile = "/data/Git/winutils/hadoop-3.1.1/bin/winutils.txt"

    try {
        // Read the binary content from the input file
        val binaryData = Files.readAllBytes(Paths.get(inputFile))

        // Encode the binary content to Base64
        val encodedData = Base64.getEncoder().encodeToString(binaryData)

        // Write the Base64-encoded text to the output file
        Files.writeString(Paths.get(outputFile), encodedData)

        println("Encoded Base64 file saved to: $outputFile")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
