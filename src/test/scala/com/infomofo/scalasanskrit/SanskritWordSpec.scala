package com.infomofo.scalasanskrit

import org.scalatest.FlatSpec

class SanskritWordSpec extends FlatSpec {
  "A word" should "be well-formed" in {
    val word = SanskritWord("समस्थिति")
    assert (word.toIpaPhoneme == "sɐmɐst̪ʰit̪ih")
  }
}
