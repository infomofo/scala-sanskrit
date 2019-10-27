package com.infomofo.scalasanskrit

case class SanskritWord (sanskrit: String) {

  val sanskritLetters = sanskrit.toCharArray.map(SanskritLetter.lookupLetter)

  def toIpaPhoneme: String = {
    sanskritLetters.map(_.ipa).mkString("")
  }
}
