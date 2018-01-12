import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flattener {

    public List flatten(List nested) {

        List<List> flatList = new ArrayList();
        List flat = new ArrayList();

        Collections.addAll(flatList, nested);
//        flat.removeAll(null);

        for (int i = 0; i < flatList.size(); i++) {

            if(flatList.get(i) != null) {
                if (flatList.get(i) instanceof List) {
                    flatten(flatList.get(i));
                } else {
                    flat.add(flatList.get(i));
                }
            }
        }
        return flat;
    }
}
