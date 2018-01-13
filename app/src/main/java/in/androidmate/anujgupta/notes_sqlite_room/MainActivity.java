package in.androidmate.anujgupta.notes_sqlite_room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.androidmate.anujgupta.notes_sqlite_room.adapters.NotesAdapter;
import in.androidmate.anujgupta.notes_sqlite_room.database.DatabaseHandler;
import in.androidmate.anujgupta.notes_sqlite_room.models.Note;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvNotes)
    RecyclerView rvNotes;

    RecyclerView.Adapter adapter;
    List<Note> notesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initViews();
        loadNotes();

    }

    private void initViews() {

        rvNotes.setLayoutManager(new LinearLayoutManager(this));
    }

    private void loadNotes(){
        DatabaseHandler db = new DatabaseHandler(this);

        notesList = db.getAllNotes();

        adapter = new NotesAdapter(this,notesList);

        rvNotes.setAdapter(adapter);

    }

}
