package ua.test.base

object TestBase {
  
  def tprint (text: String): Unit = {
    println (text)
  }

  def tprint (text1: String, text2: String): Unit = {
    tprint ((text1 + ":").padTo(30, ' ') + text2)
  }

  def tprint (indentCount: Int, text1: String, text2: String): Unit = {
    tprint (indent (indentCount) + text1, text2)
  }
  
  def indent (count: Int): String = {
    
    var indentText = ""
    for (i <- 1 to count) {
      indentText = indentText + "    "
    }
    
    indentText
  }

}