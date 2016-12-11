package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Just the import of the webapp-config.xml of spring-batch-admin-manager.
 *
 * @author Thomas Bosch
 */
//@Configuration
@ImportResource("classpath:/org/springframework/batch/admin/web/resources/webapp-config.xml")
public class WebappConfiguration {

}