package org.jhotdraw.undo.steps;

import org.jhotdraw.undo.UndoRedoManager;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

public class WhenUndoRedo {
    @ExpectedScenarioState
    private UndoRedoManager undoRedoManager;

    public WhenUndoRedo an_undoable_action_is_made() {
        undoRedoManager.addEdit(new javax.swing.undo.AbstractUndoableEdit());
        return self();
    }

    public WhenUndoRedo undo_is_pressed() {
        undoRedoManager.undo();
        return self();
    }

    public WhenUndoRedo redo_is_pressed() {
        undoRedoManager.redo();
        return self();
    }
}
