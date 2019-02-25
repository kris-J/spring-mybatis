import com.fangjie.mybatis.bean.Student;
import com.fangjie.mybatis.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/25 15:34
 */
public class StudentServiceTest {

    static StudentService studentService;

    @Before
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
        studentService = applicationContext.getBean(StudentService.class);
    }

    @Test
    public void getAllStudentTest() {
        List<Student> allStudent = studentService.getAllStudent();
        for (Student student : allStudent) {
            System.out.println(student);
        }
    }
}
