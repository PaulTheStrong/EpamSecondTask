package test.com.epam.task.second.string;

import com.epam.task.second.strings.CharArrayStringProcessor;
import com.epam.task.second.strings.StringProcessor;

public class CharArrayStringProcessorTest extends StringProcessorTest {

    @Override
    protected StringProcessor getProcessorBehavior() {
        return new CharArrayStringProcessor();
    }
}
