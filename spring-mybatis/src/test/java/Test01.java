import com.zhuandian.mapper.StudentMapper;
import com.zhuandian.pojo.Student;
import com.zhuandian.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {


    public Test01() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentMapper = context.getBean("StudentServiceImpl", StudentServiceImpl.class);


        //查询
        Student student = studentMapper.findStudentById(1);
        System.out.println(student.getUsername());


        //修改
        System.out.println(student.getUsername()+" 修改前。。。。。");
        student.setUsername("Tom");
        studentMapper.updateStudent(student);
        System.out.println(studentMapper.findStudentById(1).getUsername()+" 修改后。。。。。");

        //删除
//        studentMapper.deleteStudentById(14);

        //增加
        Student student1 = new Student();
        student1.setId(11);
        student1.setUsername("xiaoming");
        student1.setPassword("*****");

        studentMapper.insertStudentToDB(student1);
    }

}
