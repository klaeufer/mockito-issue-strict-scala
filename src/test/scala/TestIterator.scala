import org.mockito.{ IdiomaticMockito, MockitoScalaSession }
import org.scalatest.{ Matchers, WordSpec }

class TestIterator extends WordSpec with Matchers with IdiomaticMockito {

  "Iterator" should {

    "handle next() correctly" in MockitoScalaSession().run {
      val s = spy(Iterator(1, 2, 3))
      s.next()
      s.next() wasCalled once
    }
  }
}