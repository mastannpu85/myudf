import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;


public class SimpleUDFExampleTest {
    @Test
    public void testUDF() {
        SimpleUDFExample example = new SimpleUDFExample();
        Assert.assertEquals("Hello world", example.evaluate(new Text("world")).toString());
    }
}
