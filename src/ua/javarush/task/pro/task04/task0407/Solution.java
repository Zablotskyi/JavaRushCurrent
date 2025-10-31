package ua.javarush.task.pro.task04.task0407;

/* 
Сума чисел, не кратних 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int count = 101;
        int sum = 0;

        while (count > 0) {
            count--;
            if ((count % 3 == 0)) {
                continue;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}