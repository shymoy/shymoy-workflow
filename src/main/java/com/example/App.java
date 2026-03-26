package com.example;

public class App {

    public String buildPrTitle(String scope, String summary) {
        sayHellow();
        return "feat(" + scope + "): " + summary;
    }

    public boolean isReadyForMerge(boolean ciPassed, int reviewCommentCount) {
        return ciPassed && reviewCommentCount == 0;
    }

    public static void sayHellow() {
        System.out.println("I love you");
    }
}
