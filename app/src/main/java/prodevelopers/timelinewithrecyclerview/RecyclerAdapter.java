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

    private List<Integer> dataList;
    private Activity mContext;

    public RecyclerAdapter(List<Integer> mList, Activity ctx) {
        dataList = mList;
        mContext = ctx;
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
        int s = dataList.get(position);
        holder.ivDivider.setImageDrawable(mContext.getResources().getDrawable(s));

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
