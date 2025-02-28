package org.jhotdraw.undo;

import org.junit.Before;
import org.junit.Test;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoableEdit;
import static org.junit.Assert.*;

public class UndoRedoManagerTest {
    private UndoRedoManager undoRedoManager;

    @Before
    public void setUp() {
        undoRedoManager = new UndoRedoManager();
    }

    @Test
    public void testUndoRedoManagerStartsEmpty() {
        assertFalse("Undo should not be possible at start", undoRedoManager.canUndo());
        assertFalse("Redo should not be possible at start", undoRedoManager.canRedo());
    }

    @Test //Redo works after undo
    public void testRedoAfterUndo() {
        UndoableEdit edit = new AbstractUndoableEdit();
        undoRedoManager.addEdit(edit);

        undoRedoManager.undo();
        assertTrue("Redo should be possible after an undo", undoRedoManager.canRedo());

        undoRedoManager.redo();
        assertFalse("Redo should not be possible after redoing the last edit", undoRedoManager.canRedo());
    }
}
