package swu.xl.listview;

/**
 * Model：好友模型
 */
public class FriendBean {
    //头像资源id
    public int icon_id;
    //好友名称
    public String name;

    /**
     * 构造方法
     */
    public FriendBean(int icon_id, String name) {
        this.icon_id = icon_id;
        this.name = name;
    }
}

