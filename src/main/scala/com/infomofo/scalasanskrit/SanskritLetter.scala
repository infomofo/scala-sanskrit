package com.infomofo.scalasanskrit

case class SanskritLetter(sanskrit: String, latin: String, ipa: String, description: Option[String] = None)

object SanskritLetter {
  val letters = List(
    SanskritLetter("अ", "a", "ə"),
    SanskritLetter("आ", "aa", "ɑː"),
    SanskritLetter("इ", "i", "i"),
    SanskritLetter("ई", "ii", "iː"),
    SanskritLetter("उ", "u", "ʊ"),
    SanskritLetter("ऊ", "uu", "uː"),
    SanskritLetter("ऋ", "r", "ɻ̩"),
    SanskritLetter("ऌ", "l", "l̩"),
    SanskritLetter("ऍ", "e", "ɛ"),
    SanskritLetter("ऎ", "e", "e"),
    SanskritLetter("ए", "e", "eː"),
    SanskritLetter("ऐ", "ai", "ɛː"),
    SanskritLetter("ऑ", "o", "ɔ"),
    SanskritLetter("ऒ", "o", "o", Some("Short O")),
    SanskritLetter("ओ", "o", "oː"),
    SanskritLetter("औ", "au", "ɔː"),
    SanskritLetter("क", "ka", "kə"),
    SanskritLetter("ख", "kha", "kʰə"),
    SanskritLetter("ग", "ga", "ɡə"),
    SanskritLetter("घ", "gha", "ɡʱə"),
    SanskritLetter("ङ", "nga", "ŋə"),
    SanskritLetter("च", "ca", "tʃə"),
    SanskritLetter("छ", "cha", "tʃʰə"),
    SanskritLetter("ज", "ja", "dʒə"),
    SanskritLetter("झ", "jha", "dʒʱə"),
    SanskritLetter("ञ", "nya", "ɲə"),
    SanskritLetter("स", "sa", "sɐ"),
    SanskritLetter("म", "ma", "mɐ"),
    SanskritLetter("ति", "s", "mɐ"),
    SanskritLetter("a", "ti", "t̪ih"),
  )

  def lookupLetter(letter: String): SanskritLetter = {
    letters.find(_.sanskrit.equals(letter)).get
  }
}
