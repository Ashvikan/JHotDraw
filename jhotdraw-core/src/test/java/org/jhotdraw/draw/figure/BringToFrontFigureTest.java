package org.jhotdraw.draw.figure;

import static org.junit.Assert.assertEquals;

import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.Drawing;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BringToFrontFigureTest {

    private Drawing drawing;
    private Figure figureA;
    private Figure figureB;
    private Figure figureC;

    @Before
    public void setUp() {
        drawing = new DefaultDrawing();

        // Using three figures so the ordre actually makes sense
        figureA = new RectangleFigure(0, 0, 10, 10);
        figureB = new RectangleFigure(20, 20, 10, 10);
        figureC = new RectangleFigure(40, 40, 10, 10);

        drawing.add(figureA);
        drawing.add(figureB);
        drawing.add(figureC);
    }

    @Test
    public void bringToFront_movesSelectedFigureToTop() {
        // Move middle B figur to front
        drawing.bringToFront(figureB);

        // Convert children to a list so we can check the order
        List<Figure> figures = new ArrayList<>();
        drawing.getChildren().forEach(figures::add);

        assertEquals(figureB, figures.get(figures.size() - 1));
    }

    @Test
    public void sendToBack_movesSelectedFigureToBottom() {
        drawing.sendToBack(figureB);

        List<Figure> figures = new ArrayList<>();
        drawing.getChildren().forEach(figures::add);

        assertEquals(figureB, figures.get(0));
    }

    @Test
    public void bringToFront_whenAlreadyOnTop_keepsItOnTop() {
        // figur C is already on top
        drawing.bringToFront(figureC);

        List<Figure> figures = new ArrayList<>();
        drawing.getChildren().forEach(figures::add);

        assertEquals(figureC, figures.get(figures.size() - 1));
    }
}
