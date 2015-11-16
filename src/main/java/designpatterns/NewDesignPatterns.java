package designpatterns;

import designpatterns.decorator.DecoratorDesignPattern;
import designpatterns.nullobject.NullObjectDesignPattern;
import designpatterns.singleton.SingletonDesignPattern;

/**
 * Created by Tomek on 2015-11-08.
 */
public class NewDesignPatterns {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Hello new design patterns!\n");
        NullObjectDesignPattern.main(null);
        DecoratorDesignPattern.main(null);
        SingletonDesignPattern.main(null);
    }
}
