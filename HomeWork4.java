// // 0.1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.List;
// public class HomeWork4 {
//     public static void main(String[] args) {
//         Integer [] arr = new Integer [10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = i;
//         }
//         for (int i : arr) {
//             System.out.print(i);
//         }
//         toStack(arr);
//     }
//     public static void toStack(Integer [] arr) {
//         List<Integer> linLst = new LinkedList<>(Arrays.asList(arr));
//         System.out.println(linLst);
//     }   
// }


// * 0.2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.Queue;
// public class HomeWork4 {
//     public static void main(String[] args) {
//         Character [] arr = new Character [10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = (char) (i + 65);
//     }
//         toQueue(arr);
//     }
//     public static void toQueue(Character [] arr) {
//         Queue<Character> queueLst = new LinkedList<>(Arrays.asList(arr));
//         System.out.print(queueLst);       
//     }   
// }


// // * 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

// import java.util.List;
// import java.util.ArrayList;
// import java.util.Collections;
// public class HomeWork4 {
//     public static void main(String[] args) {
//         List<Character> lstOfChars = new LinkedList<Character> ();       
//         for (int i = 65; i < 75; i++) {
//             lstOfChars.add((char) i);          
//         }
//         System.out.println(lstOfChars);
//         System.out.print(reverseList(lstOfChars));
//     }   
//     public static <T> List <T> reverseList(List<T> linLst) {
//         List<T> reverse = new ArrayList<>(linLst);
//         Collections.reverse(reverse);
//         return reverse;       
//     }   
// }


// /** 2 Реализовать консольное приложение, которое:
// * Принимает от пользователя строку вида
// * text~num
// * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// * Если ввод не содержит символа ~, то завершает программу с ошибкой.
// * Если введено -1, то выходим
// * string~3
// * java~5
// * print~0 => ""
// * print~3 => string
// **/
// import java.util.LinkedList;
// import java.util.Scanner;
// public class HomeWork4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String userInput = "";
//         LinkedList<String> linkedList = new LinkedList<>();
//         for (int i = 0; i < 10; i++) {
//             linkedList.add("");           
//         }
//         do {
//             userInput = sc.nextLine();
//             if (userInput.equals("-1")) 
//                 break;
//             String[] words = userInput.split("~");
//             int index;
//             index = Integer.parseInt(words[1]);
//             if (words[0].equals("print")){
//                 System.out.println(linkedList.get(index));
//                 linkedList.remove(index);
//             }
//             else{
//                 linkedList.add(index, words[0]);
//             }
//         }
//         while (userInput != "-1");
//         System.out.println("конец истории, введен -1");
//         sc.close();
//     }
// }