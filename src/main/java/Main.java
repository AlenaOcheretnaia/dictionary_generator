import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Наше сообщение от жителей
        String message = "Jfjfk djkfjfd Kjsjkd jksjkds jksdjkdf kjsdjkfd";

        // Объявляем "функцию", присваиваем ее переменной myDictionary.
        Function<String, List<String>> myDictionary = message1 -> Stream.of(message1.split(" "))
                .sorted(Comparator.comparing(n->n.toUpperCase()))
                .peek(System.out::println)
                .collect(Collectors.toList());

        //с т.з. функционального программирования можем:
        //присваивать функцию переменным,
        //передавать функцию как аргумент другим функциям и методам,
        //получать функцию как результат.

        myDictionary.apply(message);

        // or

        List<String> newDic = myDictionary.apply(message);
        System.out.println(newDic);
    }

    public interface Function<F, T> {
        T apply(F from);
    }

}
