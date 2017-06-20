package haileo.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    int foodItems[];
    LayoutInflater layoutInflater;
    Context context;
    public CustomAdapter(Context applicationContext, int[] foodItems) {

       this.context=applicationContext;
        this.foodItems=foodItems;
        layoutInflater=(LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return foodItems.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

     @Override
    public long getItemId(int position) {
        return 0;
    }

        @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            convertView=layoutInflater.inflate(R.layout.gridview,null);
            ImageView icon=(ImageView)convertView.findViewById(R.id.icon);
           icon.setImageResource(foodItems[position]);
        return  convertView;
    }
}
