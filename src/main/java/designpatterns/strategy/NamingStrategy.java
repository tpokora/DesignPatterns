package designpatterns.strategy;

/**
 * Created by Tomek on 2015-11-18.
 */
public interface NamingStrategy {

    String VALUE_TO_ADD = "Hello";

    public String rename(String str);
}
