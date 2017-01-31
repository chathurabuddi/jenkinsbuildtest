package lk.chathurabuddi;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by chathura on 1/19/17.
 */
public class TestCalculator {
    @Test
    public void testAdd(){
        Assert.assertEquals(5.0,new Calculator().add(2.0,3.0));
        Assert.assertEquals(5.0,new Calculator().add(0.0,5.0));
        Assert.assertEquals(5.0,new Calculator().add(5.0,0.0));
        Assert.assertEquals(5.0,new Calculator().add(1.5,3.5));
        Assert.assertEquals(5.0,new Calculator().add(1.5,3.5));
        Assert.assertEquals(5.0,new Calculator().add(6.0,-1.0));
        Assert.assertEquals(5.0,new Calculator().add(7.0,-2.0));
        Assert.assertEquals(5.0,new Calculator().add(8.0,-2.0));
    }
}
