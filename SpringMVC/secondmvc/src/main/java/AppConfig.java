
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("controllers")
public class AppConfig implements WebMvcConfigurer{
    // public void addViewControllers(ViewControllerRegistry registry) {
    //     registry.addViewController("/").setViewName("index");
    //  }
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver irv = new InternalResourceViewResolver();
        //irv.setViewClass(JstlView.class);
        irv.setPrefix("/WEB-INF/views/");
        irv.setSuffix(".jsp");
        irv.setOrder(0);
        return irv;
    }
    
}