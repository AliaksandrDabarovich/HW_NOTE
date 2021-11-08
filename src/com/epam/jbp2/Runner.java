package com.epam.jbp2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Note note1 = new Note("rrr", new Date(2021, 12, 31));
        Note note2 = new Note("eee", new Date(2022, 2, 1));
        List<Note> noteList = Arrays.asList(note1, note2);

        NotebookProvider notebookProvider = NotebookProvider.getInstance();
        int notebookIndex = notebookProvider.createNewNoteBook();
        Notebook notebook = notebookProvider.getNotebook(notebookIndex);
        notebook.addNote(note1);
        notebook.addNote(note2);

        System.out.println(notebook.findNoteByText("rrr"));
        System.out.println(notebook.findNoteByDate(new Date(2022, 2, 1)));
    }
}
