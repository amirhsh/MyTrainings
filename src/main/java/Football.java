import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Very Very Very bad solution
 */
public class Football {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line = bufferedReader.readLine();
            String[] chars = line.split("");
            int zerosCount = 0;
            int onesCount = 0;
            HashMap<String,Integer> hashMap = new HashMap<>();
            hashMap.put("Zeros",zerosCount);
            hashMap.put("Ones",onesCount);
            int finalDang = 0;
            int charLength = chars.length;
           for (int i = 0 ; i < charLength && finalDang <7 ; i++ ){
                   if (chars[i].equals(new String("0"))){
                       onesCount = 0;
                       zerosCount = zerosCount +1;
                       finalDang = zerosCount;

                   }else if(chars[i].equals(new String("1"))){
                       zerosCount = 0;
                       onesCount = onesCount + 1;
                       finalDang = onesCount;

                   }
                hashMap.put("Zeros",zerosCount);
                hashMap.put("Ones",onesCount);
           }
            zerosCount = hashMap.get("Zeros");
            onesCount = hashMap.get("Ones");
           if( zerosCount >= 7 || onesCount >= 7){
                System.out.println("YES");
           }else {
               System.out.println("NO");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
