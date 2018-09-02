package ugd3_9010_a.com.ugd3_9010_a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNama;
    private EditText mNIM;
    private Button mRegisterButton;
    private Button mShowButton;

    //Kambing Guling
    //ASASASDASDASDA
    //aSDASDASDASDASDASDASDASDJKASDASJDIOAJSIODJOIASJDIOJAOIDJAIOJSD
//HJHGJGJGKHUH
    //suma asuu
    StudentsDAO studentsDAO = new StudentsDAO();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAtribut();
        mRegisterButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                studentsDAO=new StudentsDAO(mNama.getText().toString(),mNIM.getText().toString());
                studentsDAO.save();
                startIntent();

            }
        });
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent();
            }
        });
    }
    private void setAtribut(){
        mNama=findViewById(R.id.Nama);
        mNIM=findViewById(R.id.NIM);
        mRegisterButton=findViewById(R.id.Register);
        mShowButton=findViewById(R.id.ShowList);
    }
    private void startIntent(){
        Intent intent=new Intent(MainActivity.this,ShowActivity.class);
        startActivity(intent);
    }
}
