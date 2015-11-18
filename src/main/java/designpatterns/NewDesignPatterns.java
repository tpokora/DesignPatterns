package designpatterns;

import designpatterns.decorator.DecoratorDesignPattern;
import designpatterns.nullobject.NullObjectDesignPattern;
import designpatterns.singleton.SingletonDesignPattern;
import designpatterns.strategy.NamingStrategy;
import designpatterns.strategy.StrategyDesignPattern;

/**
 * Created by Tomek on 2015-11-08.
 */
public class NewDesignPatterns {
    public static void main(String[] args) throws IllegalAccessException {

        if (args.length != 0) {
            if (args[0].equals("--null")) {
                NullObjectDesignPattern.main(null);
            } else if (args[0].equals("--decorator")) {
                DecoratorDesignPattern.main(null);
            } else if (args[0].equals("--singleton")) {
                SingletonDesignPattern.main(null);
            } else if (args[0].equals("--strategy")) {
                StrategyDesignPattern.main(null);
            } else {
                System.out.println("Unknown design pattern.");
            }
        } else {
            System.out.println("Hello new design patterns!\n");
            System.out.println("Use parameters to see design pattern:");
            System.out.println("--null\t\t - Null object design pattern");
            System.out.println("--decorator\t - Decorator design pattern");
            System.out.println("--singleton\t - Singleton design pattern");
            System.out.println("--strategy\t - Strategy design pattern");
        }

    }
}
