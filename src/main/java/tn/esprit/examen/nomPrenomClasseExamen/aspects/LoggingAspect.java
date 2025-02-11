package tn.esprit.examen.nomPrenomClasseExamen.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution (* tn.esprit.examen.nomPrenomClasseExamen.services.*.*(..))")
    public void methodCall() {}

    @Before("methodCall()")
    public void methodEntry(JoinPoint joinPoint){

        log.info("Bienvenue à l'un des services de lapplication Boycott  "+joinPoint.getSignature().getName());
    }

    @AfterReturning("methodCall()")
    public void logMethodExitReturn(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("AfterReturning " + name + " avec succès ! ");
    }


}
