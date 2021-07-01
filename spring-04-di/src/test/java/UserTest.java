import com.luoyingmm.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user.equals(user2));
    }

}
