import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {
  	// The main function reads the input in the required format.
  	// Just complete the solve function below.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n =  Integer.parseInt(br.readLine());
            String out_ = solve(n);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
  
    static String solve(int n){
      	// Your code goes here
        // n is the given input
      Scanner sc=new Scanner (System.in);
      int N=sc.nextint();
      if(N/2==2 || N/2==7)
      {
      System.out.println("Special");      
      }
      else
      {
      System.out.println("Regular");
      }
      
        String result = "Special";
        return result;
    }
}
