package ut.com.jira.plugin.vsu;

import org.junit.Test;
import com.jira.plugin.vsu.api.MyPluginComponent;
import com.jira.plugin.vsu.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}