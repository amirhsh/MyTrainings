import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitPlusPlus {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n>=1 && n<=150){
                while (i < n){
                    String line = bufferedReader.readLine();
                    if(line.startsWith("++") || line.endsWith("++")){
                        x++;
                    }else if (line.startsWith("--") || line.endsWith("--")){
                        x--;
                    }
                    i++;
                }
            }
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
