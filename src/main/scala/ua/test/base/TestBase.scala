package ua.test.base

object TestBase {
  
  val BORDER_CHARACTER = "*"
  
  def tprint (text: String): Unit = {
    println (text)
  }

  def tprint (text1: String, text2: String): Unit = {
    tprint ((text1 + ":").padTo(30, ' ') + text2)
  }

  def tprint (indentCount: Int, text1: String, text2: String): Unit = {
    tprint (indent (indentCount) + text1, text2)
  }
  
  def tprintDone (): Unit = {
    
    println
    println ("Done.")
    println
  }
  
  def tprintHeader (headerText: String): Unit = {
    
		println
		println ("************  " + headerText + "  ************")
		println    
  }
  
  def tprintTitle (title: String): Unit = {
		
		val length = title.length()
		
		println (BORDER_CHARACTER * (length + 12))
		println (BORDER_CHARACTER + BORDER_CHARACTER + "    " + title + "    " + BORDER_CHARACTER + BORDER_CHARACTER)
		println (BORDER_CHARACTER * (length + 12))
		println
	}
  
  def indent (count: Int): String = {
    
    var indentText = ""
    for (i <- 1 to count) {
      indentText = indentText + "    "
    }
    
    indentText
  }

}