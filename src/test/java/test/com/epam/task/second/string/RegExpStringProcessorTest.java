package test.com.epam.task.second.string;

import com.epam.task.second.strings.RegExpStringProcessor;
import com.epam.task.second.strings.StringProcessor;

public class RegExpStringProcessorTest extends StringProcessorTest {

    @Override
    protected StringProcessor getProcessorBehavior() {
        return new RegExpStringProcessor();
    }
}
