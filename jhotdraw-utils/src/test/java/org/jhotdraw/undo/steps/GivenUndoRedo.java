package org.jhotdraw.undo.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.undo.UndoRedoManager;

public class GivenUndoRedo {
    @ProvidedScenarioState
    private UndoRedoManager undoRedoManager;

    public GivenUndoRedo nothingToUndo() {
        undoRedoManager = new UndoRedoManager();
        return self();
    }

    public GivenUndoRedo actionPerformed() {
        undoRedoManager = new UndoRedoManager();
        undoRedoManager.addEdit(new javax.swing.undo.AbstractUndoableEdit());
        return self();
    }
}
