package org.jhotdraw.draw.figure;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.Drawing;

public class WhenReordering extends Stage<WhenReordering> {

    public WhenReordering() {}

    @ExpectedScenarioState
    Drawing drawing;

    @ExpectedScenarioState
    Figure selected;

    public WhenReordering the_selected_figure_is_brought_to_front() {
        drawing.bringToFront(selected);
        return self();
    }
}
