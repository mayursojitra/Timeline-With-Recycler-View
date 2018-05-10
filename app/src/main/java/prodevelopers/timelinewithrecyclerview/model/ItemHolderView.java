package prodevelopers.timelinewithrecyclerview.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import prodevelopers.timelinewithrecyclerview.R;

public class ItemHolderView extends RecyclerView.ViewHolder {
    public ImageView ivDivider;

    public ItemHolderView(View view) {
        super(view);
        ivDivider = (ImageView) view.findViewById(R.id.ivDivider);
    }
}
