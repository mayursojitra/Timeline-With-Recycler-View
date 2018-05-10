package prodevelopers.timelinewithrecyclerview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import prodevelopers.timelinewithrecyclerview.model.ItemHolderView;

public class RecyclerAdapter extends RecyclerView.Adapter<ItemHolderView> {

    private List<Integer> moviesList;
    private Activity mContext;

    public RecyclerAdapter(List<Integer> moviesList, Activity mContext) {
        this.moviesList = moviesList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ItemHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);

        return new ItemHolderView(itemView);
    }

    @Override
    public void onBindViewHolder(ItemHolderView holder, int position) {
        int s = moviesList.get(position);
        holder.ivDivider.setImageDrawable(mContext.getResources().getDrawable(s));

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
