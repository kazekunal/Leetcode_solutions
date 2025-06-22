package Leetcode_sol.codechef;

import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[N][M];

        // Read matrix input
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;

        // Sum the border elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == M - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        // Check the conditions
        int topBottomSum = 0, leftRightSum = 0;

        // Sum of top and bottom row
        for (int j = 0; j < M; j++) {
            topBottomSum += matrix[0][j] + matrix[N - 1][j];
        }

        // Sum of left and right column (excluding corners to avoid double counting)
        for (int i = 1; i < N - 1; i++) {
            leftRightSum += matrix[i][0] + matrix[i][M - 1];
        }

        // Output result
        System.out.println((topBottomSum % 2 == 0 && leftRightSum % 2 == 0) ? sum : -1);
    }
}