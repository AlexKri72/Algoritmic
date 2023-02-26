package HomeworkLesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAIN4 {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
        System.out.print("Input the element: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                    System.out.println();

                } catch (Exception ignored) {

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
