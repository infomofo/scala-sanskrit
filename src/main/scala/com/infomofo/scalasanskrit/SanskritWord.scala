package com.infomofo.scalasanskrit

case class SanskritWord (sanskrit: String) {

  val sanskritLetters: List[SanskritLetter] = ???

  def toIpaPhoneme: String = {
    sanskritLetters.map(_.ipa).mkString("")
  }
}

object SanskritWord {

}
