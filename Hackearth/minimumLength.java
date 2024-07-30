import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                b[i] = sc.nextInt();
            }

            int start = -1, end = -1;

            for(int i=0; i<n; i++){
                if(a[i]!=b[i]){
                    if(start == -1){
                        start = i;
                    }
                    else{
                        end = i;
                    }
                }
            }            
            System.out.println(end-start+1);
        }
    }
}
