package com.stripe.interview;

import com.google.common.html.HtmlEscapers;

public class Main {
    public static void main(String... args) {

        System.out.println("Hello world!");
        System.out.println(useGuavaForSomeReason("Hey there!"));
    }

    public static String useGuavaForSomeReason(String input) {
        return HtmlEscapers.htmlEscaper().escape(input);
    }
}
