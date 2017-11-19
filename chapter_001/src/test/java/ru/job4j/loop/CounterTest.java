package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 
 public class CounterTest {
    @Test
    public void testSum() {
      
     Counter counter = new Counter(1, 10);
        // execute method - is and get result;
        int rsl = counter.add(1, 10);
        // assert result by excepted value.
        assertThat(rsl, is(30));
   }
}