import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class JavaTest {

    @Test public void testScalaF() {
        final SUT s = spy(new SUT());
        s.f();
        verify(s, times(1)).f();
        verifyNoMoreInteractions(s);
    }

    @Test public void testScalaG() {
        final SUT s = spy(new SUT());
        s.g();
        verify(s, times(1)).g();
        verifyNoMoreInteractions(s);
    }

    @Test public void testJavaF() {
        final JSUT s = spy(new JSUT());
        s.f();
        verify(s, times(1)).f();
        verifyNoMoreInteractions(s);
    }

    @Test public void testJavaG() {
        final JSUT s = spy(new JSUT());
        s.g();
        verify(s, times(1)).g();
        verifyNoMoreInteractions(s);
    }
}
