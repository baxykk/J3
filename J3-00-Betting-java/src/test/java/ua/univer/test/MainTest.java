package ua.univer.test;

import org.junit.Assert;
import ua.univer.main.Main;

public class MainTest {

    static void test(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        test(Main.message());
        Assert.assertEquals("aaaa", Main.message());
    }

}
