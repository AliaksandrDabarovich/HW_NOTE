package com.epam.jbp2.view;

import com.epam.jbp2.entity.Note;
import com.epam.jbp2.entity.Notebook;

import java.util.List;

public class PrintNoteView {
    public static void print(List<Note> notes) {
        System.out.println(notes);
    }

    public static void print(Note note) {
        System.out.println(note);
    }

    public static void print(Notebook nb) {
        System.out.println(nb);
    }

    public static void print(Notebook nb, String message) {
        System.out.println(message);
        System.out.println(nb);
    }
}
