package com.epam.jbp2.logic;

import com.epam.jbp2.entity.Note;
import com.epam.jbp2.entity.Notebook;
import com.epam.jbp2.repository.NoteByDateComparator;
import com.epam.jbp2.repository.NoteByNameComparator;
import com.epam.jbp2.repository.NotebookProvider;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class NoteBookLogic {
    private static final NotebookProvider notebookProvider = NotebookProvider.getInstance();
    private Notebook notebook;

    public NoteBookLogic() {
        this.notebook = notebookProvider.addNotebook(new Notebook());
    }

    public NoteBookLogic(int index) {
        this.notebook = notebookProvider.getNotebook(index);
    }

    public void setNotebook(int noteBookIndex) {
        notebook = notebookProvider.getNotebook(noteBookIndex);
    }

    public Notebook getNotebook() {
        return  notebook;
    }

    public Note findNoteByText(String searchText) {
        List<Note> noteList = notebook.getNoteList();
        if (!searchText.isEmpty()) {
            for (Note note : noteList) {
                if (note.getNote().equals(searchText)) {
                    return note;
                }
            }
        }
        return null;
    }

    public Note findNoteByDate(Date date) {
        List<Note> noteList = notebook.getNoteList();
        if (date != null) {
            for (Note note : noteList) {
                if (note.getDate().equals(date)) {
                    return note;
                }
            }
        }
        return null;
    }

    public int createNoteBook(Note ... notes) {
        return notebookProvider.createNoteBook(notes);
    }

    public int getQuantityOfNoteBooks() {
        return notebookProvider.getQuantityOfNoteBooks();
    }

    public void updateNoteText(int noteIndex, String newText) {
        notebook.getNote(noteIndex).setNote(newText);
    }

    public void updateNoteDate(int noteIndex, Date upadtedDate) {
        notebook.getNote(noteIndex).setDate(upadtedDate);
    }

    public void sortNotesByName() {
        Comparator comparator = new NoteByNameComparator();
        notebook.getNoteList().sort(comparator);
    }

    public void sortNotesByDate() {
        Comparator comparator = new NoteByDateComparator();
        notebook.getNoteList().sort(comparator);
    }

}
