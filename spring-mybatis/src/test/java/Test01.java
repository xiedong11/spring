import com.zhuandian.mapper.StudentMapper;
import com.zhuandian.pojo.Student;
import com.zhuandian.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentMapper = context.getBean("StudentServiceImpl", StudentServiceImpl.class);


        Student student = studentMapper.findStudentById(14);
        System.out.println(student.getUsername());

        studentMapper.deleteStudentById(14);
    }

}
