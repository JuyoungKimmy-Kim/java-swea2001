package org.swea.eclipse;


import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			int map[][]=new int[N][N];
			
			//input data
			for (int i=0; i<N; i++)
				for (int j=0; j<N; j++)
					map[i][j]=sc.nextInt();
			
			int result=0;
			
			for (int i=0; i<=N-M; i++) {
				for (int j=0; j<=N-M; j++) {
					int cnt=0;
					for (int l=i; l<i+M; l++) {
						for (int k=j; k<j+M; k++) {
							cnt+=map[l][k];
						}
					}
					result=Math.max(result, cnt);
				}
			}
			System.out.printf("#%d %d", tc, result);
		}
	}
}
