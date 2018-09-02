package ugd3_9010_a.com.ugd3_9010_a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowActivity extends AppCompatActivity {
    private List<StudentsDAO> mListStudent = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecycleAdapter recycleAdapter;
    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        recycleAdapter= new RecycleAdapter(mListStudent);
        layoutManager=new LinearLayoutManager(getApplicationContext());
        setRecyclerView();
        recyclerView.setAdapter(recycleAdapter);
    }
    private void setRecyclerView(){
        List<StudentsDAO> mList;
        //Select Data All
        mList = StudentsDAO.listAll(StudentsDAO.class);
        mListStudent.addAll(mList);
        recycleAdapter.notifyDataSetChanged();
    }
}
