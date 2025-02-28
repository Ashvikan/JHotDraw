package org.jhotdraw.undo.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.undo.UndoRedoManager;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThenUndoRedo {
    @ExpectedScenarioState
    private UndoRedoManager undoRedoManager;

    public ThenUndoRedo the_action_can_be_undone() {
        assertTrue("Undo should be possible", undoRedoManager.canUndo());
        return self();
    }

    public ThenUndoRedo the_action_can_be_redone() {
        assertTrue("Redo should be possible", undoRedoManager.canRedo());
        return self();
    }

    public ThenUndoRedo undo_is_not_possible() {
        assertFalse("Undo should not be possible", undoRedoManager.canUndo());
        return self();
    }
}
