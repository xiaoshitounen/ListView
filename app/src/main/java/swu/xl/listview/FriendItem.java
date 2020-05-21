package swu.xl.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Controller：控制器
 */
public class FriendItem {
    //item对应的模型
    private FriendBean bean;

    //item对应的视图
    private int layout;

    //存储关联好的视图
    private View item_view;

    /**
     * 构造方法
     */
    public FriendItem(FriendBean bean, Context context) {
        this.bean = bean;
        this.layout = R.layout.friend_layout;

        //关联
        initView(context);
    }

    //将模型和视图关联
    private void initView(Context context){
        //1.获取布局
        View inflate = LayoutInflater.from(context).inflate(layout, null);

        //2.获取子视图
        ImageView icon_view = inflate.findViewWithTag(context.getResources().getString(R.string.icon));
        TextView name_view = inflate.findViewWithTag(context.getResources().getString(R.string.name));

        //3.设置数据
        icon_view.setImageResource(bean.icon_id);
        name_view.setText(bean.name);

        //4.保存视图
        item_view = inflate;
    }

    //get方法
    public View getItem_view() {
        return item_view;
    }
}
