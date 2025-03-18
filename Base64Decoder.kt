import java.util.Base64
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: kotlin Base64DecoderKt <inputFile> <outputFile>")
        return
    }

    val inputFile = args[0]
    val outputFile = args[1]

    try {
        // Read the Base64-encoded content from the file
        val encodedData = Files.readString(Paths.get(inputFile)).trim()

        // Decode the Base64 content
        val decodedBytes = Base64.getDecoder().decode(encodedData)

        // Write the binary output
        Files.write(Paths.get(outputFile), decodedBytes)

        println("Decoded binary file saved to: $outputFile")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
