import java.util.Scanner;

public class prog23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 0.0;
        double avg = 0.0;
        double score[] = new double[num];
        for(int i = 0; i<num; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }
        System.out.printf("%.1f\n", sum);
        System.out.printf("%.1f", sum / num);
    }
}
