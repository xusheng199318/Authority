import com.alibaba.druid.pool.DruidDataSource;
import com.xusheng.dao.CsUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * Created by xusheng on 2017/10/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class DaoTest {

    @Autowired
    private DruidDataSource dataSource;

    @Autowired
    private CsUserMapper csUserMapper;

    @Test
    public void testDataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testGetUser() {
        System.out.println(csUserMapper.getUserByUsername("admin"));
    }
}
