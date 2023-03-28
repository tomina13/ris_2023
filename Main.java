/**
 * Программа, использующая два класса ArrayList и LinkedList, для удаления элементов из коллекции.
 * @author Tomina V.A.
 */

import java.util.ArrayList; // импортируем класс ArrayList
import java.util.LinkedList; // импортируем класс LinkedList

public class Main {
    public static void main(String[] args) {
        int N = 20; // число человек в кругу
        ArrayList<Integer> list = new ArrayList<>(); // создаем пустой список

        for (int i = 1; i <= N; i++) {
            list.add(i); // заполняем список числами от 1 до N
        }

        int index = 0; // начинаем считать с 1-го человека

        while (list.size() > 1) { // пока в списке больше одного элемента
            index = (index + 1) % list.size(); // определяем индекс следующего человека
            list.remove(index); // удаляем каждого второго человека
        }

        System.out.println("Остался человек с номером " + list.get(0)); // выводим номер оставшегося человека

        LinkedList<Integer> linkedList = new LinkedList<>(); // создаем пустой связный список

        for (int i = 1; i <= N; i++) {
            linkedList.add(i); // заполняем список числами от 1 до N
        }

        index = 0; // начинаем считать с 1-го человека

        while (linkedList.size() > 1) { // пока в списке больше одного элемента
            index = (index + 1) % linkedList.size(); // определяем индекс следующего человека
            linkedList.remove(index); // удаляем каждого второго человека
        }

        System.out.println("Остался человек с номером " + linkedList.get(0)); // выводим номер оставшегося человека
    }
}

// программа моделирует процесс подсчета по кругу, в котором вычеркивается каждый второй человек, пока не останется один
// используется два класса для хранения элементов списка: ArrayList и LinkedList
// вначале заполняется список числами от 1 до N
// затем каждый второй человек вычеркивается из списка до тех пор, пока не останется один
// результат - номер оставшегося человека
// программа выводит номер оставшегося человека из ArrayList и LinkedList в консоль.
// ArrayList бытрее работает в случаях, когда требуется частое чтение данных из коллекции, а LinkedList при добавлении
// и удалении элементов из коллекции. Поэтому для данного задания больше подойдет LinkedList.