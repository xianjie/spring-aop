import org.aspectj.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xian jie
 * @date: 2016/5/6 15:55
 */
public class AspectAdviceTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        /*
         * 编写测试类时注意这里需要把类型转换为接口
         */
        UserService userService = (UserService) ac.getBean("userService");
        userService.addUser();

    }
}
