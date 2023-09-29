import java.util.Comparator;

public abstract class NotebookBrandSort implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2){
        return o1.getBrand().compareToIgnoreCase(o2.getBrand());
    }
}
