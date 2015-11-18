package designpatterns.strategy;

/**
 * Created by Tomek on 2015-11-18.
 */
public class SuffixNamingStrategy implements NamingStrategy {

    public String rename(String str) {
        return str + " " + VALUE_TO_ADD;
    }
}
