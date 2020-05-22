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
    public FriendItem(FriendBean bean, Context context, View convertView) {
        this.bean = bean;
        this.layout = R.layout.friend_layout;

        //关联
        initView(context,convertView);
    }

    //将模型和视图关联
    private void initView(Context context,View convertView){
        //1.获取布局
        ViewHolder viewHolder;
        if (convertView == null){
            //2.获取子视图

            //加载布局
            convertView = LayoutInflater.from(context).inflate(layout, null);
            //完善ViewHolder
            viewHolder = new ViewHolder();
            viewHolder.icon_view = convertView.findViewWithTag(context.getResources().getString(R.string.icon));
            viewHolder.name_view = convertView.findViewWithTag(context.getResources().getString(R.string.name));
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //3.设置数据
        viewHolder.icon_view.setImageResource(bean.icon_id);
        viewHolder.name_view.setText(bean.name);

        //4.保存视图
        item_view = convertView;
    }

    /**
     * 内部类：ViewHolder
     */
    private class ViewHolder{
        public ImageView icon_view;
        public TextView name_view;
    }

    //get方法
    public View getItem_view() {
        return item_view;
    }

}
