package guru.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by piyush.b.kumar on May 14, 2018.
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("## I'm in the LifeCycleBean constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## The LifeCycleBean has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## The LifeCycleBean has its properties set!w");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("## Bean Factory has been set");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("## My bean name is:" + arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("## Application context has been set");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("## The post construct annotated method has been called");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## The pre destroy annotated method has been called");
	}

	public void beforeInit() {
		System.out.println("## - Before Init - called by bean post processor");
	}

	public void afterInit() {
		System.out.println("## - After Init - called by bean post processor");
	}

}
