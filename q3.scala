object StringFormatter {
  def toUpper(str: String): String = str.toUpperCase
  
  def toLower(str: String): String = str.toLowerCase
  
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)
    
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    for ((name, index) <- names.zipWithIndex) {
        var output = name
        (index % 4) match {
            case 0 => output = formatNames(name)(toUpper)
            case 1 => output = formatNames(name)(x => toUpper(x.take(2)) + toLower(x.drop(2)))
            case 2 => output = formatNames(name)(toLower)
            case 3 => output = formatNames(name)(x => toUpper(x.take(1)) + toLower(x.drop(1).dropRight(1)) + toUpper(x.takeRight(1)))
            case _ => output = name
        }

        println(output)
    }

  }
}
