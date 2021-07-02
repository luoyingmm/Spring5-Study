import com.luoyingmm.mapper.UserMapperImpl;
import com.luoyingmm.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapperImpl = context.getBean("UserMapperImpl", UserMapperImpl.class);
//        List<User> user = userMapperImpl.getUser();
//        for (User user1 : user) {
//            System.out.println(user1);
//        }

        userMapperImpl.addUser(new User(7, "小王", "324234"));
//        userMapperImpl.deleteUser(0);


    }

}
