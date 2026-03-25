package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void shouldBuildConventionalPrTitle() {
        App app = new App();

        assertEquals("feat(ai-agent): add ci demo", app.buildPrTitle("ai-agent", "add ci demo"));
    }

    @Test
    void shouldOnlyAllowMergeWhenCiPassedAndNoReviewCommentsRemain() {
        App app = new App();

        assertTrue(app.isReadyForMerge(true, 0));
        assertFalse(app.isReadyForMerge(false, 0));
        assertFalse(app.isReadyForMerge(true, 2));
    }
}
