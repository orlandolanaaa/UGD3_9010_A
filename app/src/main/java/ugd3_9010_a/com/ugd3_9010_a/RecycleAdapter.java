package ugd3_9010_a.com.ugd3_9010_a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    private List<StudentsDAO> mList;
    public RecycleAdapter(List<StudentsDAO>mList){this.mList=mList;}
    public class MyViewHolder extends   RecyclerView.ViewHolder{
        public TextView mNama,mNIM;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            mNama = itemView.findViewById(R.id.mNama);
            mNIM = itemView.findViewById(R.id.mNIM);
        }
    }
    @NonNull
    @Override
    public RecycleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_adapter,parent,false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.MyViewHolder holder, int position){
        StudentsDAO studentsDAO=mList.get(position);
        holder.mNama.setText("Nama\t:"+studentsDAO.Nama);
        holder.mNIM.setText("NIM\t\t:"+studentsDAO.NIM);
    }
    @Override
    public int getItemCount(){
        return mList.size();
    }
}
