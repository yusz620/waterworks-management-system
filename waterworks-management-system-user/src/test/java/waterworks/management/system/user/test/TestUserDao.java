package waterworks.management.system.user.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import waterworks.management.system.user.dao.UserDao;
import waterworks.management.system.user.dao.Impl.UserDaoImpl;
import waterworks.management.system.user.model.UserBean;

public class TestUserDao {
    private UserDao userDao;

    @Before
    public void beforeClass() {
        userDao = new UserDaoImpl();
    }

    @Test
    public void testGetAllUser() {
        List<UserBean> users = userDao.getAllUser();
        for (UserBean user : users) {
            System.out.println(user.toString());
        }
        assertNotNull(users);
    }
}

