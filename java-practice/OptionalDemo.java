import java.util.Optional;

public class OptionalDemo {

  public static void main(String[] args) {
    String[] words = new String[10];

    Optional<String> word = Optional.ofNullable(words[4]); // otherwise if the value is null then NullPointerException

    if (word.isPresent())
      System.out.println(word.get().toUpperCase()); // convert the word string to uppercase
    else
      System.out.println(word.orElse("not initialised")); // default name
  }
}
