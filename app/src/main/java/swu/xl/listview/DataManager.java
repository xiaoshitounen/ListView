package swu.xl.listview;

import java.util.List;

/**
 * 数据管理者
 */
public class DataManager {
    //数据
    private List<FriendBean> beans;

    //单例模式
    private static DataManager instance = null;
    //私有化构造方法
    private DataManager(){
        loadData();
    }
    public static synchronized DataManager getDataManager(){
        if (instance == null){
            instance = new DataManager();
        }
        return instance;
    }

    //加载数据
    private void loadData() {
        beans = DataUtil.loadData();
    }

    //get方法
    public List<FriendBean> getBeans() {
        return beans;
    }
}
