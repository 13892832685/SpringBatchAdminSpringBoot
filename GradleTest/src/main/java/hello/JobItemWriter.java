package hello;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by jialin on 11/18/16.
 */
@Component
@Configuration
public class JobItemWriter implements ItemWriter {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void write(List items) throws Exception {
        long id = System.currentTimeMillis();
        String sql = "insert into person values("+id+",'"+id+"','"+id+"')";
        jdbcTemplate.execute(sql);
    }
}
