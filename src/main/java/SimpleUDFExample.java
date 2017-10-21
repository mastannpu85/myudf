import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.BinaryComparable;

public class SimpleUDFExample extends UDF {
    public Text evaluate(Text input) {
        if(input == null) return null;
        return new Text("Hello " + input.toString());
    }
}
