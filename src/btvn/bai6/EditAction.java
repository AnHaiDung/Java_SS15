package btvn.bai6;

import java.util.Scanner;

public class EditAction {
    private String description;
    private String editedBy;
    private String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return "[" + editTime + "] " + description + " bởi " + editedBy;
    }
}
