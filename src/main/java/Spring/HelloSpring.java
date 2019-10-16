package Spring;

import Spring.entity.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {
    public static void main(String[] args) {
        System.out.println("begin");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring/beans/beans.xml");
        System.out.println("new factory xml done");
        hello helloSpring=(hello) context.getBean("hello");
        System.out.println("get hello done");
        System.out.println(helloSpring.getMassage());
        context.registerShutdownHook();
    }
}
