import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 피연산자 개수
        String expression = br.readLine(); // 후위 표기식

        double[] values = new double[26];
        for (int i = 0; i < N; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch >= 'A' && ch <= 'Z') { 
                stack.push(values[ch - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                double result = 0;

                switch (ch) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }

                stack.push(result);
            }
        }
        System.out.printf("%.2f\n", stack.pop());
    }
}
