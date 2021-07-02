import com.luoyingmm.mapper.UserMapper;
import com.luoyingmm.mapper.UserMapperImpl;
import com.luoyingmm.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("UserMapperImpl", UserMapper.class);
        List<User> user = userMapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }


    }

}
