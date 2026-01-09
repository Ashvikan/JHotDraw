package org.jhotdraw.draw.figure;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.assertj.core.api.Assertions;
import org.jhotdraw.draw.Drawing;

import java.util.ArrayList;
import java.util.List;

public class ThenDrawingOrder extends Stage<ThenDrawingOrder> {

    public ThenDrawingOrder() {}

    @ExpectedScenarioState
    Drawing drawing;

    @ExpectedScenarioState
    Figure selected;

    public ThenDrawingOrder the_figure_is_on_top() {
        List<Figure> figures = new ArrayList<>();
        drawing.getChildren().forEach(figures::add);

        Assertions.assertThat(figures.get(figures.size() - 1))
                .isEqualTo(selected);

        return self();
    }
}
