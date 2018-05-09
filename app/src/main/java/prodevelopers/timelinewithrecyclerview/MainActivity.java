package prodevelopers.timelinewithrecyclerview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Activity mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycler View
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Data
        List<Integer> dataList = new ArrayList<>();
        dataList.add(R.drawable.itemtwo);
        dataList.add(R.drawable.itemone);
        dataList.add(R.drawable.itemtwo);
        dataList.add(R.drawable.itemone);
        dataList.add(R.drawable.itemtwo);
        dataList.add(R.drawable.itemone);
        dataList.add(R.drawable.itemfour);
        dataList.add(R.drawable.itemfour);
        dataList.add(R.drawable.itemtwo);
        dataList.add(R.drawable.itemthree);
        dataList.add(R.drawable.itemthree);
        dataList.add(R.drawable.itemone);
        dataList.add(R.drawable.itemtwo);


        //Recycler View Adapter
        RecyclerAdapter mAdapter = new RecyclerAdapter(dataList, mContext);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
