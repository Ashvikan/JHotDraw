package org.jhotdraw.draw.figure;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.Drawing;

public class GivenDrawing extends Stage<GivenDrawing> {

    public GivenDrawing() {}

    @ProvidedScenarioState
    Drawing drawing;

    @ProvidedScenarioState
    Figure selected;

    public GivenDrawing a_drawing_with_multiple_figures() {
        drawing = new DefaultDrawing();

        Figure a = new RectangleFigure(0, 0, 10, 10);
        selected = new RectangleFigure(20, 20, 10, 10);
        Figure c = new RectangleFigure(40, 40, 10, 10);

        drawing.add(a);
        drawing.add(selected);
        drawing.add(c);

        return self();
    }

    public GivenDrawing a_selected_figure() {
        return self();
    }
}
