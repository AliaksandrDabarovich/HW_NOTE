package com.epam.jbp2;

import com.epam.jbp2.entity.Note;
import com.epam.jbp2.entity.Notebook;
import com.epam.jbp2.logic.NoteBookLogic;
import com.epam.jbp2.repository.NotebookProvider;
import com.epam.jbp2.view.PrintNoteView;

import java.time.Year;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        NoteBookLogic noteBookLogic = new NoteBookLogic();

        try {
            Note note1 = new Note("Bext1", new Date(122, 11, 31));
            Note note2 = new Note("Aext2", new Date(121, 2, 1));

            //create notebook
            int index = noteBookLogic.createNoteBook(note1, note2);
            System.out.println(noteBookLogic.getQuantityOfNoteBooks());

            //update note text
            noteBookLogic.setNotebook(index);
            int updatedNoteIndex = 1;
            noteBookLogic.updateNoteText(updatedNoteIndex, "A new Text1");

            //update note date
            Date updatedDate = new Date(155, 5, 5);
            noteBookLogic.updateNoteDate(updatedNoteIndex, updatedDate);
            PrintNoteView.print(note2);

            //sort notes by name
            PrintNoteView.print(noteBookLogic.getNotebook(), "Before sorting by name");
            noteBookLogic.sortNotesByName();
            PrintNoteView.print(noteBookLogic.getNotebook(), "After sorting by name");

            //sort notes by date
            PrintNoteView.print(noteBookLogic.getNotebook(), "Before sorting by date");
            noteBookLogic.sortNotesByDate();
            PrintNoteView.print(noteBookLogic.getNotebook(), "After sorting by date");

        } catch (Exception e) {
            System.out.println("sorry (");
        }

    }
}
