package com.epam.jbp2;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {
    private String note;
    private Date date;

    public Note(String note, Date date) {
        this.note = note;
        this.date = date;
    }

    public Note() {
        this.note = null;
        this.date = null;
    }

    public Note(String note) {
        this.note = note;
        this.date = null;
    }

    public Note(Date date) {
        this.note = null;
        this.date = date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Note noteForCompare = (Note) obj;
        return  (note == noteForCompare.getNote() || (note != null && note.equals(noteForCompare.getNote()))) && (date == noteForCompare.getDate() || (date != null && date.equals(noteForCompare.getDate())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((note != null) ? 0 : note.hashCode());
        result = prime * result + ((date != null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "com.epam.jbp2.Note{" +
                "note='" + note + "', date=" + date +
                '}';
    }
}
