package btvn.bai6;

import java.util.Scanner;
import java.util.Stack;

public class UndoManager {
    private Stack<InputAction> undoStack;
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.undoStack = new Stack<>();
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        undoStack.push(action);
        if (undoStack.size() > maxUndoSteps) {
            undoStack.remove(0);
        }
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) {
            return null;
        }
        return undoStack.pop();
    }
}
