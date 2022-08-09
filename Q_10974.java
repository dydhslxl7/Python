/*
    모든 순열
*/

import java.util.Scanner;

public class Q_10974 
{
    private static int N;
    private static int[] nums;
    private static boolean[] visited;
    private static int[] sequence;

    public static void main(String[] args) 
    {        
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        nums = new int[N];
        visited = new boolean[N];
        sequence = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }

        permutation(0);
        
        in.close();
    }

    public static void permutation(int depth)
    {
        if(depth == N)
        {
            for (int i : sequence) 
            {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) 
        {
            if(!visited[i])
            {
                visited[i] = true;
                sequence[depth] = nums[i];
                permutation(depth+1);
                visited[i] = false;
            }
        }

    }
}