package swu.xl.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final XLListView listView = findViewById(R.id.list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "位置"+position+"被点击了", Toast.LENGTH_SHORT).show();

                XLListView.MyAdapter adapter = listView.getAdapter();
                if (position == 0){
                    //更新数据
                    List<FriendBean> beans = DataManager.getDataManager().getBeans();
                    if (beans.size() == 1){
                        //更新数据
                        beans.clear();
                        beans.addAll(DataUtil.loadData());
                        //刷新
                        adapter.notifyDataSetChanged();
                    }else {
                        //更新数据
                        beans.clear();
                        beans.add(new FriendBean(R.drawable.ic_launcher_foreground,"新的item"));
                        //刷新
                        adapter.notifyDataSetChanged();
                        adapter.notifyDataSetInvalidated();
                    }
                }
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "位置"+position+"被长按了", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
