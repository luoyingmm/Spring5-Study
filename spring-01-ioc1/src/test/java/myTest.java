import com.luoyingmm.dao.UserDaoImpl;
import com.luoyingmm.dao.UserDaoImplOracle;
import com.luoyingmm.service.UserService;
import com.luoyingmm.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImplOracle());
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
