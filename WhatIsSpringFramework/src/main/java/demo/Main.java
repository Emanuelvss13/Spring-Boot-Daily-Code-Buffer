package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = applicationContext.getBean(Doctor.class);
//        Nurse nurse = (Nurse) applicationContext.getBean("nurse");
//
//        doctor.assit();
//        nurse.assit();

//          Staff staff = applicationContext.getBean(Doctor.class);

//          staff.assit();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = applicationContext.getBean(Doctor.class);

        doctor.assit();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

//        Doctor doctor1 = applicationContext.getBean(Doctor.class);
//
//        System.out.println(doctor1);

    }
}
