package com.ag.rent.aop;
//package com.ag.p2p.aop;
//
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.ag.p2p.config.ApplicationProperties;
//import com.ag.rent.constant.JobConstants;
//import com.ag.rent.domain.BatchJobControl;
//import com.ag.rent.repository.BatchJobControlRepository;
//
//import lombok.extern.log4j.Log4j2;
//
//@Aspect
//@Component
//@Log4j2
//public class AuditAspect {
//
//	@Autowired
//	ApplicationProperties applicationProperties;
//
//	@Around("execution(* com.ag.p2p.service.OrderService.run(..)) && args(..)")
//	public void processAroundJobExecution(final ProceedingJoinPoint joinPoint)
//			throws Throwable {
//	
//
//		long start = System.currentTimeMillis();
//
//		try {
//			joinPoint.proceed();
//		} finally {
//			log.info("{}.{} took {} seconds", joinPoint.getSignature().getDeclaringType().getSimpleName(),
//					joinPoint.getSignature().getName(),
//					TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start));
//
//		}
//	}
//}