import java.util.Comparator;
public abstract class NotebookOsSort implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2){
        return o1.getOpSys().compareToIgnoreCase(o2.getOpSys());
    }
}
