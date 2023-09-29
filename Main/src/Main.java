import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Notebook> notebookS = new ArrayList<>();
        Notebook notebook1 = new Notebook(123, "hp", 4, 500, "win");
        Notebook notebook2 = new Notebook(223, "msi", 3, 120, "lin");
        Notebook notebook22 = new Notebook(233, "msi", 3, 250, "lin");
        Notebook notebook3 = new Notebook(623, "apple", 6, 1000, "mac");
        notebookS.add(notebook1);
        notebookS.add(notebook2);
        notebookS.add(notebook3);
        notebookS.add(notebook22);


        System.out.println("Введите критерий поиска (1-ОЗУ, 2-HDD, 3-Бренд, 4-ОС): ");
        Scanner console = new Scanner(System.in);
        Integer zapros = Integer.valueOf(console.nextLine());


//        System.out.println("Введите параметр: ");
//        String parametr = console.nextLine();

        NotebookSearch search = new NotebookSearch();
//        search.searchRAM(notebookS, Integer.parseInt(parametr));

        if (zapros==1){
            System.out.println("Введите объем оперативной памяти (Гб), 0 - все результаты: ");
            String parametr = console.nextLine();
            search.searchRAM(notebookS, Integer.parseInt(parametr));

        }
        else if (zapros==2) {
            System.out.println("Введите объем жесткого диска (Гб), 0 - все результаты: ");
            String parametr = console.nextLine();
            search.searchHDD(notebookS, Integer.parseInt(parametr));
        }
        else if (zapros==3) {
            System.out.println("Введите бренд (hp/msi/apple), 0 - все результаты: ");
            String parametr = console.nextLine();
            search.searchBrand(notebookS, parametr);
        }
        else if (zapros==4) {
            System.out.println("Введите операционную систему (win/lin/mac), 0 - все результаты: ");
            String parametr = console.nextLine();
            search.searchOS(notebookS, parametr);
        }
        else {
            System.out.println("Не верный запрос!");
        }



    }



}