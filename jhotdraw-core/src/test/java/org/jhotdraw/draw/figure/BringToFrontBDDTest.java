package org.jhotdraw.draw.figure;

import com.tngtech.jgiven.junit5.JGivenExtension;
import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(JGivenExtension.class)
public class BringToFrontBDDTest
        extends ScenarioTest<GivenDrawing, WhenReordering, ThenDrawingOrder> {

    @Test
    public void bring_selected_figure_to_front() {
        given().a_drawing_with_multiple_figures()
                .and().a_selected_figure();

        when().the_selected_figure_is_brought_to_front();

        then().the_figure_is_on_top();
    }
}
