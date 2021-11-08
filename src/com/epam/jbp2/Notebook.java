package com.epam.jbp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

public class Notebook {
    private List<Note> noteList;

    public Notebook() {
        noteList = new ArrayList<>();
    }

    public Notebook(List<Note> noteList) {
        this.noteList = noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void addNote(Note note) {
        noteList.add(note);
    }

    public void addNote(String noteText) {
        noteList.add(new Note(noteText));
    }

    public Note getNote(int index) {
        return noteList.get(index);
    }

    public void deleteNote(Note note) {
        noteList.remove(note);
    }

    public Note findNoteByText(String searchText) {
        if (!searchText.isEmpty()) {
            for (Note note : noteList) {
                if (note.getNote().equals(searchText)) {
                    return note;
                }
            }
        }
        throw new NoSuchElementException("Unable to locate note with text: " + searchText);
    }

    public Note findNoteByDate(Date date) {
        if (date != null) {
            for (Note note : noteList) {
                if (note.getDate().equals(date)) {
                    return note;
                }
            }
        }
        throw new NoSuchElementException("Unable to locate note with date: " + date);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (obj.getClass()  != this.getClass())) {
            return false;
        }

        Notebook notebookForCompare = (Notebook) obj;
        return (noteList == notebookForCompare.getNoteList() || (noteList != null && noteList.equals(notebookForCompare.getNoteList())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return prime * result + (noteList != null ? 0 : noteList.hashCode());
    }

    @Override
    public String toString() {
        return "com.epam.jbp2.Notebook{" +
                "noteList=" + noteList +
                '}';
    }
}
