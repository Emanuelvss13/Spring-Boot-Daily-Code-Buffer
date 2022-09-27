package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(*))")
    public void logger(JoinPoint joinPoint) {
//        System.out.println(joinPoint.getSignature());
        String arg = joinPoint.getArgs()[0].toString();
        System.out.println("Logger With Args: " + arg);
    }

    @After("execution(* demo.ShoppingCart.checkout(*))")
    public void afterLogger() {
        System.out.println("After Logger");
    }

}
