@main def init() ={
    def calculateInterest(depositAmount: Double): Double = {
        depositAmount match {
            case amount if amount <= 20000 => amount * 0.02
            case amount if amount <= 200000 => amount * 0.04
            case amount if amount <= 2000000 => amount * 0.035
            case amount => amount * 0.065
        }
    }

    println(calculateInterest(10000))
    println(calculateInterest(20000))
    println(calculateInterest(200000))
    println(calculateInterest(300000))
}