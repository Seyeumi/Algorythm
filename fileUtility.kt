
fun File.toStringArray(Delimiter: String) =
    readLines()
    .flatmap { it.split(Delimiter.toRegex())}
    .filter {it.isNotEmpty()}
    .map{it.toLowerCase()}
    .toArray;

val words = file("Shaekspear").toStringArray("[^a-zA-z]")