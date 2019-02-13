import org.mockito.{ IdiomaticMockito, MockitoScalaSession }
import org.scalatest.{ Matchers, WordSpec }

class Test extends WordSpec with Matchers with IdiomaticMockito {

  "SUT" should {

    "handle g correctly" in MockitoScalaSession().run {
      val s = spy(new SUT)
      s.g()
      s.g() wasCalled once
    }

    "handle g and other interaction correctly" in MockitoScalaSession().run {
      val s = spy(new SUT)
      s.f()
      s.g()
      s.f() wasCalled once
      s.g() wasCalled once
    }
  }

  "JSUT" should {

    "handle g correctly" in MockitoScalaSession().run {
      val s = spy(new JSUT)
      s.g()
      s.g() wasCalled once
    }

    "handle g and other interaction correctly" in MockitoScalaSession().run {
      val s = spy(new JSUT)
      s.f()
      s.g()
      s.f() wasCalled once
      s.g() wasCalled once
    }
  }
}
