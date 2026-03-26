package com.example;

import java.sql.SQLOutput;

public class App {

    public String buildPrTitle(String scope, String summary) {
        return "feat(" + scope + "): ~~~///(^v^)~~" + summary;
    }

    public boolean isReadyForMerge(boolean ciPassed, int reviewCommentCount) {
        return ciPassed && reviewCommentCount == 0;
    }
}
