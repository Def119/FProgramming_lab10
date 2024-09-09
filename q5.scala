def countLetterOccurrences(words: List[String]): Int = {
  val wordLengths = words.map(_.length) 
  wordLengths.reduce(_ + _)
}


@main def main()={

val words = List("apple", "banana", "cherry", "date")
val totalLetters = countLetterOccurrences(words)

println(s"Total count of letter occurrences: $totalLetters")

}