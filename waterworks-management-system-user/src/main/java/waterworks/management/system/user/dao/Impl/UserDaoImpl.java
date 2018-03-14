package waterworks.management.system.user.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import waterworks.management.system.user.dao.UserDao;
import waterworks.management.system.user.model.UserBean;
import waterworks.management.system.user.utils.MyBatisUtil;

public class UserDaoImpl implements UserDao {
    @Override
    public List<UserBean> getAllUser() {
        // 获得会话对象
        SqlSession session = MyBatisUtil.getSqlSession(true);
        try {
            UserDao userDao = session.getMapper(UserDao.class);
            return userDao.getAllUser();
        } finally {
            session.close();
        }
    }

}
