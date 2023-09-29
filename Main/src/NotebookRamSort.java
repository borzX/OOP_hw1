import java.util.Comparator;
public class NotebookRamSort implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2){
        return o1.getRamVal()-o2.getRamVal();
    }
}
