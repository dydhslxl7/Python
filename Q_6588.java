/*
    골드바흐의 추측
    https://velog.io/@kimmjieun/%EB%B0%B1%EC%A4%80-6588%EB%B2%88-%EA%B3%A8%EB%93%9C%EB%B0%94%ED%9D%90%EC%9D%98-%EC%B6%94%EC%B8%A1-Java-%EC%9E%90%EB%B0%94
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_6588
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean prime[] = new boolean[1000001];
        prime[0] = prime[1] = true; // 소수는 false
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                for (int j = i + i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }

        }

        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            boolean isProve = false;
            for (int i = 2; i <= n / 2; i++) {
                if (!prime[i] && !prime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    isProve = true;
                    break;
                }
            }

            if (!isProve) {
                System.out.println("Goldbach's conjecture is wrong.");
            }

            n = Integer.parseInt(br.readLine());

        }

    }
    
}