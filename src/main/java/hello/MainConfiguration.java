package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ ServletConfiguration.class, WebappConfiguration.class})
public class MainConfiguration {

}