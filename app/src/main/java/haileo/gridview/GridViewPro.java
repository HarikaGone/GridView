package haileo.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class GridViewPro extends Activity {
GridView simpleGridView;
    int[] foodItems={R.drawable.banana,R.drawable.bargar,R.drawable.beryani,R.drawable.jamun,R.drawable.jelabi,R.drawable.laddu,R.drawable.meals,R.drawable.noodils,R.drawable.pakodi,R.drawable.popcorn,R.drawable.samosa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_pro);
        simpleGridView=(GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter=new CustomAdapter(this,foodItems);
        simpleGridView.setAdapter(customAdapter);
    }
}
