package hello;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jialin on 11/18/16.
 */
@Component
@Configuration
public class JobItemReader implements ItemReader {

    List list = new ArrayList();

    @BeforeStep
    public void beforeStep(StepExecution stepExecution){
        System.out.println("READER-BeforeStep");
        System.out.println(stepExecution.getJobExecution().getJobParameters().getString("cobdate"));
        list.add("ok");
    }

    @Override
    public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        System.out.println("READER-read");
        if(!list.isEmpty()){
            return list.remove(0);
        }
        return null;
    }
}
