package com.example;

public class App {

    public String buildPrTitle(String scope, String summary) {
        return "feat(" + scope + "): " + summary;
    }

    public boolean isReadyForMerge(boolean ciPassed, int reviewCommentCount) {
        return ciPassed && reviewCommentCount == 0;
    }
}
