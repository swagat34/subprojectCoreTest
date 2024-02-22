package org.example;

import org.testng.annotations.Test;
import org.uiTest.Base;

public class test extends Base {

    @Test
    public void test1(){
        System.out.println("inside test child ");
        setup("chrome","https://www.facebook.com/");
        tearDownWebEnvironment();

    }

}
