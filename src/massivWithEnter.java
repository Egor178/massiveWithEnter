// с помощью сканера реализуется считывание вводимых элементов
import java.util.Scanner;
public class massivWithEnter {
    public static void main(String[] args) {
       // вводим значение i
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите i");
        // проверяем является ли i числом
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println("Ведите b ");
            // аналогично переменой i
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                // инициализируем массив с искомыми суммами
                int[] ib = new int[i + b - 1];
                // иницализируем массив "Андрей" названный вчесть того кто задал мне эту задачу
                int[][] andrey = new int[i][b];
                // заполняем андрея значениями
                for (int a = 0; a < i; a++) {
                    for (int c = 0; c < b; c++) {
                        andrey[a][c] = c;
                    }
                }
                //заполняем массив с искомыми суммами
                for (int a = 0; a < i; a++) {
                    for (int c = 0; c < b; c++) {
                        int sum = a + c;
                        ib[sum] += andrey[a][c];
                    }
                }
                // выводим на экран решения
                for (int j : ib) System.out.print(j + " ");
            }
            // фразы в случае если  перменнные i и b были заполнены не числом
            else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");}
        }
            else{
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        }
    }