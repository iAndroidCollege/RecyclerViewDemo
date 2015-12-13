package college.edu.tomer.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class AndroidVersionAdapter
        extends RecyclerView.Adapter<AndroidVersionAdapter.AndroidVersionViewHolder> {

    //Private data members
    private ArrayList<AndroidVersion> data;
    private Context context;

    //Constructor:
    public AndroidVersionAdapter(ArrayList<AndroidVersion> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public AndroidVersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.list_item_android_version,
                parent, false);
        return new AndroidVersionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AndroidVersionViewHolder holder, int position) {
        AndroidVersion currentItem = data.get(position);
        holder.tvVersionNumber.setText(currentItem.getVersionNumber());
        Picasso.with(context).load(currentItem.getImageUrl())
                .error(R.drawable.ic_error)
                .placeholder(R.drawable.ic_progress)
                .into(holder.ivAndroidVersion);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class AndroidVersionViewHolder extends RecyclerView.ViewHolder{
        ImageView ivAndroidVersion;
        TextView tvVersionNumber;

        public AndroidVersionViewHolder(View itemView) {
            super(itemView);
            ivAndroidVersion = (ImageView) itemView.findViewById(R.id.ivAndroidVersion);
            tvVersionNumber = (TextView)itemView.findViewById(R.id.tvVersionName);
        }
    }
}
