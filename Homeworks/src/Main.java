public class Main {


    public static void main(String[] args) {

//		Task1. Создать метод, который принимает массив int и сортирует его по последней цифре.
//		Используйте метод Arrays.sort. для его работы создайте свой компаратор.
//		Имеется в виду последняя цифра в записи числа, например в числе 123, последння цифра 3.
//		Надо сделать сортировку, которая учитывает только эту последнюю цифру в числе
        int[] arr = {123, 455, 214, 831, 10, 22};
//		Lesson3Task1.PrintResult(Lesson3Task1.MySort(arr));


//		Task2. Создайте класс, который представляет из себя коллекцию, добавьте 2 метода add и get для работы с коллекцией.
//		Реализуйте возможность использования цикла for-each для работы с данной коллекцией.
//		Для этого реализуйте интерфейс Iterable и создайте итератор
        Lesson03Task02 list = new Lesson03Task02();
        list.Add(4);
        list.Add(1);
        list.Add(3);
        list.Add(5);

        for(Integer num : list){
            System.out.println(num);
        }

        System.out.println();
        System.out.println(list.Get(3));
    }
}