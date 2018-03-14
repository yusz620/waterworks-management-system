package waterworks.management.system.user.dao;

import java.util.List;

import waterworks.management.system.user.model.UserBean;

public interface UserDao {
    public List<UserBean> getAllUser();
}
