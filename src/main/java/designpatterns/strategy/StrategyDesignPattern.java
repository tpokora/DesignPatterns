package designpatterns.strategy;

/**
 * Created by Tomek on 2015-11-18.
 */
public class StrategyDesignPattern {
    public static void main(String[] args) {
        StringCreator stringCreator;
        String name = "Tommy";

        System.out.println("=========================");
        System.out.println("Strategy Design Pattern");
        System.out.println("\nChange functionality depending on client that is using.\n");
        System.out.println("printString() using PrefixNamingStrategy");
        stringCreator = new StringCreator(new PrefixNamingStrategy());
        System.out.println(stringCreator.printString(name));
        System.out.println("printString() using SufixNamingStrategy");
        stringCreator = new StringCreator(new SuffixNamingStrategy());
        System.out.println(stringCreator.printString(name));
        System.out.println("=========================");
    }
}
