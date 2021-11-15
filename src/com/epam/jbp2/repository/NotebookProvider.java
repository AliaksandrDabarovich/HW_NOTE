package com.epam.jbp2.repository;

import com.epam.jbp2.entity.Note;
import com.epam.jbp2.entity.Notebook;

import java.util.ArrayList;
import java.util.Arrays;
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

    public int createNoteBook(Note... notes) {
        noteList.add(new Notebook(Arrays.asList(notes)));
        return noteList.size() - 1;

    }

    public Notebook addNotebook(Notebook notebook) {
        noteList.add(notebook);
        return notebook;
    }

    public int getQuantityOfNoteBooks() {
        return noteList.size();
    }


}
