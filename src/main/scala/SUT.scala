class SUT {

  class Inner {
    def g(): Unit = {
      println("here Inner.g")
      SUT.this.h()
    }
  }

  def e(): Unit = {
    println("here f")
    this.h()
  }

  def f(): Unit = {
    println("here f")
    SUT.this.h()
  }

  def g(): Unit = {
    println("here g")
    (new Inner).g()
  }

  def h(): Unit = {
    println("here h")
  }
}
