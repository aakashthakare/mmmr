package com.my.app1;

import com.my.common.Commons;
import org.apache.commons.lang3.StringUtils;

public class App1 {
    public static void main(String[] args) {
        Commons.saySomething("App 1");
        System.out.println(StringUtils.join("Hi!", "This line is using dependency declared in parent."));
    }
}
