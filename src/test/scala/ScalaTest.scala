import org.mockito.{ IdiomaticMockito, MockitoScalaSession }
import org.scalatest.{ Matchers, WordSpec }

class ScalaTest extends WordSpec with Matchers with IdiomaticMockito {

  "SUT" should {

    "handle f correctly" in MockitoScalaSession().run {
      val s = spy(new SUT)
      s.f()
      s.f() wasCalled once
    }

    "handle g correctly" in MockitoScalaSession().run {
      val s = spy(new SUT)
      s.g()
      s.g() wasCalled once
    }
  }

  "JSUT" should {

    "handle f correctly" in MockitoScalaSession().run {
      val s = spy(new JSUT)
      s.f()
      s.f() wasCalled once
    }

    "handle g correctly" in MockitoScalaSession().run {
      val s = spy(new JSUT)
      s.g()
      s.g() wasCalled once
    }
  }
}
