import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.BinaryComparable;


public class SimpleUDFExampleTest {
    @Test
    public void testUDF() {
        SimpleUDFExample example = new SimpleUDFExample();
        Assert.assertEquals("Hello world", example.evaluate(new Text("world")).toString());
    }
}
