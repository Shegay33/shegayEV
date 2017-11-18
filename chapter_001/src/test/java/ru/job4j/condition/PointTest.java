package ru.job4j.condition;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 
 public class PointTest {
    @Test
    public void whenPointOnLineThenTrue() {
        //create of new point.  
        Point a = new Point(1, 1);
        // execute method - is and get result;
        boolean rsl = a.testCondition(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(true));
   }
}