import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferpg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[n];
        
        String[] inp = br.readLine().split(" ");
        
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inp[i]);
        }
    }
}