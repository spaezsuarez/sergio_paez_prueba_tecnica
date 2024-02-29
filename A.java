import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        Map<String,String> firstLineData = handleInput(firstLine);
        Map<String,String> secondLineData = handleInput(secondLine);
        scanner.close();
    }

    private static Map<String,String> handleInput(String line){
        Map<String,String> response = new HashMap<>();
        String[] inputData = line.split(" ");
        response.put("x", inputData[0]);
        response.put("y", inputData[1]);
        response.put("r", inputData[2]);
        return response;
    }

}