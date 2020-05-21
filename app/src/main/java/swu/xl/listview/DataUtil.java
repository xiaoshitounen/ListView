package swu.xl.listview;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据加载工具类
 */
public class DataUtil {
    /**
     * 正常加载
     * @return
     */
    public static List<FriendBean> loadData(){
        List<FriendBean> friendBeans = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            FriendBean friendBean = new FriendBean(R.drawable.ic_launcher_background, "第" + i + "个");
            friendBeans.add(friendBean);
        }

        return friendBeans;
    }

    /**
     * 本地文件加载数据
     * @return
     */
    public static List<FriendBean> loadDateByFile(){
        return null;
    }

    /**
     * 数据库加载数据
     * @return
     */
    public static List<FriendBean> loadDateBySQL(){
        return null;
    }

    /**
     * 网络加载数据
     * @return
     */
    public static List<FriendBean> loadDateByServer(){
        return null;
    }

}
