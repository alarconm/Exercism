import java.util.ArrayList;
import java.util.List;

public class Flattener {

    public List<Object> flatten(List<Object> nested) {
        List<Object> flat = new ArrayList();

        for (int i = 0; i < nested.size(); i++) {
            if(nested.get(i) != null) {
                if (nested.get(i) instanceof List) {
                    flat.addAll(flatten((List<Object>)nested.get(i)));
                } else {
                    flat.add(nested.get(i));
                }
            }
        }
        return flat;
    }
}
