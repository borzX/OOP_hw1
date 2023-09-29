import java.util.Comparator;

public class NotebookHDDSort implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2){
        return o1.getHddVal()-o2.getHddVal();
    }
}
