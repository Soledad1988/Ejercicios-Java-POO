package ejercicios1_10;


/*public class Ejercicio_1 {

	public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 10, 11};

   int sum = simpleArraySum(ar);

   System.out.println(sum);
}

static int simpleArraySum(int[] ar) {
   int sum = 0;
   for (int num : ar) {
       sum += num;
   }
   return sum;
}

public class Ejercicio_2 {
    public static void main(String[] args) {
        String time12HourFormat = "07:05:45PM";
        String militaryTime = timeConversion(time12HourFormat);
        System.out.println(militaryTime);
    }

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String period = s.substring(8, 10);
        if (period.equals("PM") && hour != 12) {
            hour += 12;
        } else if (period.equals("AM") && hour == 12) {
            hour = 0;
        }
        return String.format("%02d", hour) + s.substring(2, 8);
    }
}

import java.util.*;

public class Ejercicio_3{
    public static void main(String[] args) {
        int[] p = {2, 3, 1};
        int[] result = permutationEquation(p);
        for (int val : result) {
            System.out.println(val);
        }
    }

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int[] result = new int[n];
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(p[i], i + 1);
        }

        for (int x = 1; x <= n; x++) {
            int y = indexMap.get(indexMap.get(x));
            result[x - 1] = y;
        }
        
        return result;
    }
}
}


import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.isEmpty()) break; // Salir si la línea está vacía
            String encryptedMessage = encryption(s);
            System.out.println(encryptedMessage);
        }

        scanner.close();
    }

    static String encryption(String s) {
        String text = s.replaceAll("\\s+", "");

        int length = text.length();
        double sqrt = Math.sqrt(length);
        int rows = (int) Math.floor(sqrt);
        int columns = (int) Math.ceil(sqrt);
        if (rows * columns < length) {
            rows++;
        }

        char[][] grid = new char[rows][columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < length) {
                    grid[i][j] = text.charAt(index);
                    index++;
                } else {
                    grid[i][j] = '\0'; // Rellenar con caracteres nulos
                }
            }
        }

        StringBuilder encryptedMessage = new StringBuilder();
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] != '\0') {
                    encryptedMessage.append(grid[i][j]);
                }
            }
            encryptedMessage.append(" ");
        }

        return encryptedMessage.toString().trim();
    }
}
*/