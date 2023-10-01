import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        /**
        Где хранятся переменные? - в оперативной памяти.
        Сколько переменных можно задать в программе? – сколько позволит оперативная память компьютера.
        Чем ограничен размер? – типом переменной.**/

        //2. Пользователь вводит строку, выведите ее длину
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String vod1 = scan.nextLine();
        int length1 = vod1.length();

        System.out.println("Длина введенной строки: " + length1);

        //3. Пользователь вводит две строки, выведите сумму их длин
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String vod = scan2.nextLine();
        int length = vod1.length() + vod.length();

        System.out.println("Сумма длин двух строк: " + length);

        //4. Пользователь вводит три строки. Найти, какая из них короче всех.
        System.out.print("Введите вторую строку: ");
        String vod2 = scan.nextLine();
        int length2 = vod2.length();

        System.out.print("Введите третью строку: ");
        String vod3 = scan.nextLine();
        int length3 = vod3.length();

        if (length1 <= length3 && length1 <= length2) {
            System.out.println("Первая строка самая короткая.");
        } else if (length2 <= length1 && length2 <= length3) {
            System.out.println("Вторая строка самая короткая.");
        } else {
            System.out.println("Третья строка самая короткая.");
        }

        //5. Пользователь вводит три дробных числа. Вывести те из них, квадратный корень которых меньше 2.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое дробное число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе дробное число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите третье дробное число: ");
        double num3 = scanner.nextDouble();

        if (Math.sqrt(num1) < 2) {
            System.out.println("Квадратный корень из первого числа меньше 2: " + Math.sqrt(num1));
        }
        if (Math.sqrt(num2) < 2) {
            System.out.println("Квадратный корень из второго числа меньше 2: " + Math.sqrt(num2));
        }
        if (Math.sqrt(num3) < 2) {
            System.out.println("Квадратный корень из третьего числа меньше 2: " + Math.sqrt(num3));
        }

        //6. Пройдите в дебаге программу. Сколько раз выводится икс?
        // Ответ: 4 раза

        /** int x = 1;
        while (x>=-3) {
            System.out.print(x);
            x = x - 1;
        }**/

        //7. Пройдите в дебаге программу. Сколько раз вызывается метод str.length()?
        // Ответ: 6 раз

        /**String str = “Hell”;
        while (str.length()<10) {
            str = str + “o”;
        }**/

        //8. Пользователь вводит два числа. Разделить меньшее на большее и вывести результат.
        Scanner scenic = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num4 = scenic.nextDouble();

        System.out.print("Введите второе число: ");
        double num5 = scenic.nextDouble();

        double result1;

        if (num4 < num5) {
            result1 = num4 / num5;
        } else {
            result1 = num5 / num4;
        }

        System.out.println("Результат деления меньшего числа на большее: " + result1);

        //9. Пользователь вводит строку. Используя substring, вывести первые 5 символов.
        Scanner symbol = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String user = symbol.nextLine();

        if (user.length() >= 5) {
            String firstFive = user.substring(0, 5);
            System.out.println("Первые 5 символов строки: " + firstFive);
        } else {
            System.out.println("Введенная строка слишком короткая, чтобы вывести первые 5 символов.");
        }

        //10. Считайте boolean-переменную. Если пользователь ввел true, вывести “истина”, иначе ничего не стоит выводить.
        Scanner bool = new Scanner(System.in);

        System.out.print("Введите значение: ");
        boolean user1 = bool.nextBoolean();

        if (user1) {
            System.out.println("истина");
        }

        //11. Пользователь вводит 3 числа. Сделайте три boolean переменных: есть ли среди введённых четное, есть ли среди введённых отрицательное, есть ли число больше тысячи
        Scanner number = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num6 = number.nextInt();

        System.out.print("Введите второе число: ");
        int num7 = number.nextInt();

        System.out.print("Введите третье число: ");
        int num8 = number.nextInt();

        boolean even = num6 % 2 == 0 || num7 % 2 == 0 || num8 % 2 == 0;
        boolean negative = num6 < 0 || num7 < 0 || num8 < 0;
        boolean thousand = num6 > 1000 || num7 > 1000 || num8 > 1000;

        System.out.println("Среди введенных чисел:");
        System.out.println("Есть ли четное число: " + even);
        System.out.println("Есть ли отрицательное число: " + negative);
        System.out.println("Есть ли число больше тысячи: " + thousand);

        //12. Пользователь вводит три строки, используя .substring(0, x) выведите эти строки, обрезав те, что длиннее самой короткой. Пример ввода: «повар», «поделка», «лампочка». Вывод: «повар», «подел», «лампо»
        Scanner scr = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scr.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scr.nextLine();

        System.out.print("Введите третью строку: ");
        String str3 = scr.nextLine();

        int minLength = Math.min(Math.min(str1.length(), str2.length()), str3.length());

        String result2 = str1.substring(0, minLength);
        String result3 = str2.substring(0, minLength);
        String result4 = str3.substring(0, minLength);

        System.out.println("Результат:");
        System.out.println("\"" + result2 + "\", \"" + result3 + "\", \"" + result4 + "\"");

        //13. Мини-игра в слова.
        Scanner game = new Scanner(System.in);

        System.out.print("Игрок 1, введите слово: ");
        String word = game.nextLine();

        System.out.print("Игрок 2, введите два числа: ");
        int startIndex = game.nextInt();
        int endIndex = game.nextInt();

        String substring = word.substring(startIndex, endIndex + 1);
        System.out.println("Подстрока: " + substring);

        System.out.print("Игрок 1, введите два числа: ");
        int player1StartIndex = game.nextInt();
        int player1EndIndex = game.nextInt();

        String player1Substring = word.substring(player1StartIndex, player1EndIndex + 1);
        System.out.println("Подстрока игрока 1: " + player1Substring);

        if (player1Substring.length() > substring.length()) {
            System.out.println("Победил игрок 1!");
        } else {
            System.out.println("Победил игрок 2!");
        }

    }
}