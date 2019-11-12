package myBatis.common;


import java.sql.Statement;
import java.util.Properties;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;

/**
 * create by: zmz
 * description: zmz create interceptor for study mybatis
 * create time: 2019/10/23 10:23
 */
@Intercepts({
        @Signature(type = ResultSetHandler.class,method = "handleResultSets",args = Statement.class)
})
//插件签名，告诉mybatis插件用来拦截那个对象的那个方法
public class myInterceptor implements Interceptor {

    /**
     * create by: zmz
     * description: 拦截目标对象
     * create time: 2019/10/23 10:31
     * @param invocation
     * @return java.lang.Object
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("MyInterceptor拦截对象是："+invocation.getTarget());
        System.out.println("MyInterceptor拦截方法是："+invocation.getMethod().toString());
        System.out.println("MyInterceptor拦截参数是："+invocation.getArgs().toString());
        //this is the real method to interceptor target object
        Object o=invocation.proceed();
        return o;
    }

    /**
     * create by: zmz
     * description: 包装目标对象 为目标对象创建动态代理
     * create time: 2019/10/23 10:31
     * @param o
     * @return java.lang.Object
     */
    @Override
    public Object plugin(Object o) {
        System.out.println("MyInterceptor-plugin:要包装的目标对象 "+ o);
        //为当前对象创建代理对象
        Object proxy=Plugin.wrap(o,this);
        return proxy;
    }

    /**
     * create by: zmz
     * description: 获取插件初始化参数
     * create time: 2019/10/23 10:35
     * @param properties
     * @return void
     */
    @Override
    public void setProperties(Properties properties) {
        String value=(String) properties.get("zmzInterceptor");
        System.out.println("MyInterceptor:插件初始化参数："+value);
    }
}
