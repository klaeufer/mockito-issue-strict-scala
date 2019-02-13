class SUT {

  def f(): Unit = {
    println("here f")
    h()
  }

  def g(): Unit = {
    println("here g")
    k()
  }

  def h(): Unit = {
    println("here h")
  }

  private def k(): Unit = {
    println("here k")
  }
}
