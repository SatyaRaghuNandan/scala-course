object PrimeNumbers extends App {


  private def isPrim(num: Int): Boolean = {
    def isPrimeVsNrFrom(div: Int): Boolean = {
      if (div >= num) true
      else if (num % div == 0) false
      else isPrimeVsNrFrom(div + 1)
    }
    isPrimeVsNrFrom(2)
  }

  private def nrPrimePanaLa(num: Int) = {
    (2 to num).filter(isPrim)
  }

  def nrPrime(num: Int): Int = {
    val numbers = nrPrimePanaLa(num)
    numbers.foreach(println)
    val count  = numbers.length
    println(s"Pana la $num sunt $count numere prime.")
    count
  }



  nrPrime(10000)

}