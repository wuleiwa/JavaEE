package aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//切面类，可以存在多个通知Advice
public class MyAspect implements MethodInterceptor {

    public Object invoke(MethodInvocation mi) throws Throwable {
        check_Permissions();
        //执行目标方法
        Object obj = mi.proceed();
        log();
        return obj;
    }

    public void log() {
        System.out.println("模拟检查权限");
    }

    public void check_Permissions() {
        System.out.println("模拟记录日志");
    }
}
