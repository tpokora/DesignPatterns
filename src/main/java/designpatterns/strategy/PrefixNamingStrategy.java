package designpatterns.strategy;

/**
 * Created by Tomek on 2015-11-18.
 */
public class PrefixNamingStrategy implements NamingStrategy {

    public String rename(String str) {
        return VALUE_TO_ADD + " " + str;
    }
}
