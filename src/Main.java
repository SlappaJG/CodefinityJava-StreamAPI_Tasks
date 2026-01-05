import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //region Task 1
        // Task 1: Use Stream API to square each number in the list and collect the result into a new list
        System.out.println("Task 1:");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original list: " + numbers);
        Stream<Integer> numbersStream = numbers.stream();
        List<Integer> resultNumber = numbersStream.map(n -> n*n).toList();
        System.out.println("Final list: " + resultNumber);
        //endregion

        //region Task 2
        // Task 2: Use Stream API to find the length of the longest name in the list.
        System.out.println("Task 2:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        System.out.println("Original list: " + names);
        int listLength = names.size();
        Stream<String> namesStream = names.stream();

        List<String> resultNameList = namesStream.sorted(Comparator.comparingInt(String::length)).skip(listLength-1).toList();
        String resultName = resultNameList.getLast();
        System.out.println("Length of longest string: " + resultName.length());
        //endregion

        //region Task 2 (Alternative)
        // Task 2: Use Stream API to find the length of the longest name in the list.
        System.out.println("Task 2 (alternative):");

        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        System.out.println("Original list: " + names2);
        Stream<String> names2Stream = names2.stream();

        int resultName2Length = names2Stream.map(n -> n.length())
                        .max(Integer::compareTo).get();
        System.out.println("Length of longest string: " + resultName2Length);
        //endregion

    }

}