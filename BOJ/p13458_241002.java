import java.util.*;
public class Solution13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;
        for(int i=0; i<n; i++) {
            arr[i] -= b;
            answer++;
            // while (arr[i] > 0) {
            //     arr[i] -= c;
            //     answer++;
            // }
            if(arr[i] > 0) {
                if(arr[i] % c > 0) {
                    answer += (arr[i]/c) +1;
                } else {
                    answer += arr[i] / c;
                }
            }
        }
        System.out.println(answer);
    }
}
