package mate.academy.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HelloWorldInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {
	// Этот метод должен содержать конфигурации которые инициализируют Beans
	// для инициализации бинов у нас использовалась аннотация @Bean
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{
				HelloWorldConfiguration.class
		};
	}

	// Тут добавляем конфигурацию, в которой инициализируем ViewResolver
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{
				HelloWorldInitializer.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}

