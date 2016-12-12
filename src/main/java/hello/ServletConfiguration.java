package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:/org/springframework/batch/admin/web/resources/servlet-config.xml")
public class ServletConfiguration {

}
