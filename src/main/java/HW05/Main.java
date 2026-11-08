//Урок 5
//
//Ваша задача - найти какое количество раз текст в PATTERN повторяется в TEXT.
// Повторения могут пересекаться друг с другом.
// Предлагаем циклом перебрать все возможные позиции в TEXT в которых может начинаться PATTERN.
// При переборе каждую позицию проверять циклом, перебирая символы в PATTERN и символы,
// которые идут начиная с перебираемой позиции.
// Если при проверке хотя бы один из символов не совпадёт - позиция не подходит и переходим к следующей.
// В противном случае нужно увеличить счётчик повторений count.

package HW05;

public class Main {

    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaa" +
            "baabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        SubStringInString ssis = new SubStringInString();
        System.out.println("Строка '" + PATTERN + "' встретилась в тексте " +
                ssis.subStringInString(TEXT, PATTERN) + " раз");
    }
}