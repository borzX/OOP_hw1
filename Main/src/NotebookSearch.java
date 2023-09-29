import java.util.*;

import java.util.Collections.*;

public class NotebookSearch  {
    private List<Notebook> notebookF = new ArrayList<>();

        public void searchRAM(List<Notebook> notebook, Integer valye) {
            for (var item : notebook) {
                if (item.getRamVal() == valye) {
                    notebookF.add(item);

                }
//                    System.out.println(notebookF);

                else if(valye ==0 ) {
                    notebookF.add(item);
                    Comparator RamComp = new NotebookRamSort();
                    Collections.sort(notebookF, RamComp);
                }

            }
        System.out.println(notebookF);
        }

    public void searchHDD(List<Notebook> notebook, Integer valye) {
        for (var item : notebook) {
            if (item.getHddVal() == valye) {
                notebookF.add(item);
            }
//                    System.out.println(notebookF);
            else if(valye ==0 ) {
                notebookF.add(item);
                Comparator HddComp = new NotebookHDDSort();
                Collections.sort(notebookF, HddComp);
            }
        }
        System.out.println(notebookF);
    }
    public void searchBrand(List<Notebook> notebook, String valye) {
        for (var item : notebook) {
            if (item.getBrand().equals(valye)) {
                notebookF.add(item);
            }
            else if(Integer.parseInt(valye) ==0 ) {
                notebookF.add(item);
                Comparator BrComp = new NotebookBrandSort() {
                    @Override
                    public int compare(Notebook o1, Notebook o2) {
                        return super.compare(o1, o2);
                    }
                };
                Collections.sort(notebookF, BrComp);




            }
//                    System.out.println(notebookF);
        }
        System.out.println(notebookF);
    }

    public void searchOS(List<Notebook> notebook, String valye) {
        for (var item : notebook) {
            if (item.getOpSys().equals(valye)) {
                notebookF.add(item);
            }
            else if(Integer.parseInt(valye) ==0 ) {
                notebookF.add(item);
                Comparator OsComp = new NotebookOsSort() {
                    @Override
                    public int compare(Notebook o1, Notebook o2) {
                        return super.compare(o1, o2);
                    }
                };
                Collections.sort(notebookF, OsComp);

            }
//                    System.out.println(notebookF);

        }
        System.out.println(notebookF);
    }
}
