import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Note note1 = new Note("rrr", new Date(2021, 12, 31));
        Note note2 = new Note("eee", new Date(2022, 2, 1));
        List<Note> noteList = Arrays.asList(note1, note2);
        Notebook notebook = new Notebook(noteList);

        System.out.println(notebook);
    }
}
