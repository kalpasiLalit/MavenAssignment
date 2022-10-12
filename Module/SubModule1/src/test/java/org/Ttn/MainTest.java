package org.Ttn;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
   public void sumTest(){
        Assert.assertEquals(50,Main.Sum(20,30));
    }
}
