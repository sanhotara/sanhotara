package com.springsecurity.config;


// import org.springframework.web.WebApplicationInitializer;
// import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
// import org.springframework.web.filter.DelegatingFilterProxy;
// import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// import jakarta.servlet.ServletContext;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.ServletRegistration;
// public class MainApp implements WebApplicationInitializer {
// ////////////////This is an alternative way to initialize SpringMVC and Spring Security//////////////////
// 	@Override
// 	public void onStartup(ServletContext servletContext) throws ServletException {
// 		System.out.println("started");
// 		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
// 		context.register(SecurityConfig.class);
// 		context.register(MvcConfiguration.class);
// 		context.setServletContext(servletContext);
// 		//servletContext.addListener(new ContextLoaderListener(context));
// 		// servletContext.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain"))
//         //   .addMappingForUrlPatterns(null, false, "/*");
// 		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));  servlet.setLoadOnStartup(1);
// 		servlet.addMapping("/");
// 		context.close();	
// 	}
// }

public class MainApp extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MvcConfiguration.class,
			SecurityConfig.class };
	}

	@Override    
    protected Class<?>[] getServletConfigClasses() {    
        // TODO Auto-generated method stub    
        return null;    
    }   
    @Override    
    protected String[] getServletMappings() {    
        return new String[] { "/" };    
    } 
}
