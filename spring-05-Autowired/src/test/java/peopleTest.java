import com.luoyingmm.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class peopleTest {
    @Test
    public void PeopleTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
