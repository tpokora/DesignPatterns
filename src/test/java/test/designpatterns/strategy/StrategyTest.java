package test.designpatterns.strategy;

import designpatterns.strategy.NamingStrategy;
import designpatterns.strategy.PrefixNamingStrategy;
import designpatterns.strategy.StringCreator;
import designpatterns.strategy.SuffixNamingStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tomek on 2015-11-18.
 */
public class StrategyTest {

    private StringCreator stringCreator;
    private String name = "Tommy";

    @Test
    public void testPrefixNamingStrategy() {
        stringCreator = new StringCreator(new PrefixNamingStrategy());
        Assert.assertEquals("Expected string Hello Tommy.", "Hello Tommy", stringCreator.printString(name));
    }

    @Test
    public void testSuffixStrategy() {
        stringCreator = new StringCreator(new SuffixNamingStrategy());
        Assert.assertEquals("Expected string Tommy Hello.", "Tommy Hello", stringCreator.printString(name));
    }
}
