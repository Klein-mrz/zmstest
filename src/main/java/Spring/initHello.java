package Spring;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class initHello implements BeanPostProcessor {
//    BeanPostProcessor:Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理。

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before init : "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after init : "+beanName);
        return bean;
    }
}
