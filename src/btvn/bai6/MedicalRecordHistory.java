package btvn.bai6;

import java.util.Scanner;
import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> editStack;
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.editStack = new Stack<>();
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (editStack.isEmpty()) {
            return null;
        }
        return editStack.pop();
    }

    public String getRecordId() {
        return recordId;
    }
}
