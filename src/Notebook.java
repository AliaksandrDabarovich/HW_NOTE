import java.util.ArrayList;
import java.util.List;

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

    public Note getNote(int index) {
        return noteList.get(index);
    }

    public void deleteNote(Note note) {
        noteList.remove(note);
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
        return "Notebook{" +
                "noteList=" + noteList +
                '}';
    }
}
