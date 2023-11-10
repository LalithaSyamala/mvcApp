import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.Dao.EmpDao;
import com.mvc.entity.EmpEntity;


public class App {
	ApplicationContext context=new ClassPathXmlApplicationContext("beanConfig.xml");  
    
    EmpDao dao=(EmpDao)context.getBean("edao");  
    int status=dao.saveEmp(new EmpEntity(103,"sri","eee","B"));
    
}
