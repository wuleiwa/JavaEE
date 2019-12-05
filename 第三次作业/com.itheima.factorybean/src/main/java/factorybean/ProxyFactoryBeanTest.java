package factorybean;
import jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
    public static void main(String[] args) {

        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //从spring容器获得内容
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
        //执行方法
        userDao.addUser();
        userDao.deleteUser();
    }
}
