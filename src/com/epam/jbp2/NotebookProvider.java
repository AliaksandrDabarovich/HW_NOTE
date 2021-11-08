package com.epam.jbp2;

import java.util.ArrayList;
import java.util.List;

public class NotebookProvider {
    private static final NotebookProvider instance = new NotebookProvider();
    private Notebook notebook = new Notebook();
    private List<Notebook> noteList = new ArrayList<>();

    private NotebookProvider() {

    }

    public Notebook getNotebook(int index) {
        return noteList.get(index);
    }

    public static NotebookProvider getInstance() {
        return instance;
    }

    public int createNewNoteBook() {
        notebook = new Notebook();
        noteList.add(notebook);
        return noteList.size() - 1;
    }
}
