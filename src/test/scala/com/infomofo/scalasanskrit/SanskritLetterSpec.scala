package com.infomofo.scalasanskrit

import org.scalatest._

class SanskritLetterSpec extends FlatSpec with Matchers {
  "A letter" should "be recognized" in {
    val letter = SanskritLetter.lookupLetter("स")
    assert (letter.isDefined)
    assert (letter.get.latin == "sa")
  }

  "A non-sanskrit string" should "not be recognized" in {
    val letter = SanskritLetter.lookupLetter("a")
    assert (letter.isEmpty)
  }

  "Part of a word" should "be parsed" in {
    val word = "समस्थिति"
    val tuple = SanskritLetter.matchFirstLetter(word)
    assert (tuple._1.isDefined)
    assert (tuple._1.exists(_.latin == "sa"))
    assert (tuple._2 == "मस्थिति")
  }
}
