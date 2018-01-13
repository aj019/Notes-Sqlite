package in.androidmate.anujgupta.notes_sqlite_room.models;

/**
 * Created by anujgupta on 13/01/18.
 */

public class Note {

    private int id;
    private String title;
    private String note;

    public Note(){

    }

    public Note(int id,String title,String note){
        this.id = id;
        this.title = title;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
