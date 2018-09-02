package ugd3_9010_a.com.ugd3_9010_a;

import com.orm.SugarRecord;

public class StudentsDAO extends SugarRecord {
    String Nama;
    String NIM;

    public StudentsDAO(){}

    public StudentsDAO(String Nama,String NIM)
    {
        this.Nama=Nama;
        this.NIM=NIM;
    }
}
