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

  protected def k(): Unit = {
    println("here k")
  }
}
