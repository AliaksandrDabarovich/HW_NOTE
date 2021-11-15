package com.epam.jbp2.repository;

import com.epam.jbp2.entity.Note;
import com.epam.jbp2.entity.Notebook;

import java.util.Comparator;

public class NoteByNameComparator implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return n1.getNote().compareTo(n2.getNote());
    }
}
