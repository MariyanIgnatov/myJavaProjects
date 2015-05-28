import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reader {
    private boolean isValid(int x, int y) {
        return ((x <= 2 && x >= 0) && (y <= 2 && y >= 0));
    }

    public Point reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Scanner scanner = new Scanner(input);
        int x = 0;
        int y = 0;
        do {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (isValid(x, y) == false)
                System.out.println("--- Bad Input! Enter Again! The Coordinates must be between 0 and 2. ---");
        } while (!isValid(x, y));
        Point point = new Point(x, y);
        scanner.close();
        return point;
    }

}
