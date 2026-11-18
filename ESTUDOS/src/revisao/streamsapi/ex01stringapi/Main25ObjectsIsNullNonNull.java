package revisao.streamsapi.ex01stringapi;

import java.util.Objects;
import java.util.stream.Stream;

public class Main25ObjectsIsNullNonNull {
    public static void main(String[] args) {

        Stream.of("Maria", "José", null, "Tiago", null)
//                .filter(Objects::nonNull)
                .filter(Objects::isNull)
                .forEach(System.out::println);
    }
}
