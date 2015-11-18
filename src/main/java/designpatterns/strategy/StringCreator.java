package designpatterns.strategy;

/**
 * Created by Tomek on 2015-11-18.
 */
public class StringCreator {

    private NamingStrategy namingStrategy;

    public StringCreator(NamingStrategy namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

    public String printString(String str) {
        return namingStrategy.rename(str);
    }

    public void setNaminStrategy(NamingStrategy namingStrategy) {
        this.namingStrategy = namingStrategy;
    }
}
