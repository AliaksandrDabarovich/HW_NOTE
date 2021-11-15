package com.epam.jbp2.repository;

import com.epam.jbp2.entity.Note;

import java.util.Comparator;

public class NoteByDateComparator implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return n1.getDate().compareTo(n2.getDate());
    }
}
