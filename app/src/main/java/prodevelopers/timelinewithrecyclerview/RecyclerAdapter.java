package prodevelopers.timelinewithrecyclerview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Integer> moviesList;
    private Activity mContext;

    public RecyclerAdapter(List<Integer> moviesList, Activity mContext) {
        this.moviesList = moviesList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int s = moviesList.get(position);
        holder.ivDivider.setImageDrawable(mContext.getResources().getDrawable(s));

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivDivider;

        public MyViewHolder(View view) {
            super(view);
            ivDivider = (ImageView) view.findViewById(R.id.ivDivider);
        }
    }
}
