class SUT {

  class Inner {
    def g(): Unit = {
      println("here gThis")
      SUT.this.h()
    }
  }

  def f(): Unit = {
    println("here f")
  }

  def g(): Unit = {
    println("here gThis")
    (new Inner).g()
  }

  private def h(): Unit = {
    println("here h")
  }
}
