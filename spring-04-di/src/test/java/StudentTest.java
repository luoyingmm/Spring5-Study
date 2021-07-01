import com.luoyingmm.pojo.Address;
import com.luoyingmm.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student name = (Student) context.getBean("student");
        System.out.println(name.toString());

    }
}
