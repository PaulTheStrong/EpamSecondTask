package test.com.epam.task.second.string;

import com.epam.task.second.strings.BasicStringProcessor;
import com.epam.task.second.strings.StringProcessor;

public class BasicStringProcessorTest extends StringProcessorTest {

    @Override
    protected StringProcessor getProcessorBehavior() {
        return new BasicStringProcessor();
    }
}
