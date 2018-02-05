package toutiao;

import java.util.Scanner;

/**
 * User: tong
 * Date: 18-2-5
 * Time: 下午9:17
 * \
 */
public class UserLike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] like = new int[n];
        int i;
        for(i = 0; i < n; i++){
            like[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int l, r, k;
        for(i = 0; i < q; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            k = sc.nextInt();
            int num = 0;
            if(l > r || l > n || r < 1){
                System.out.println(0);
            }else if(l > 0 && l <= n && r > 0 && l <= n){
                for(int j = l; j <= r; j++){
                    num += find(like, j, k);
                }
                System.out.println(num);
            } else if(l < 1 && r > 0 && l <= n){
                for(int j = 1; j <= r; j++){
                    num += find(like, j, k);
                }
                System.out.println(num);
            } else if(l > 0 && l <= n && r > n){
                for(int j = l; j <= n; j++){
                    num += find(like, j, k);
                }
                System.out.println(num);
            } else{
                for(int j = 1; j <= n; j++){
                    num += find(like, j, k);
                }
            }

        }
    }

    public static int find(int[] like, int t, int k){
        if(like[t-1] == k){
            return 1;
        }
        return 0;
    }

}