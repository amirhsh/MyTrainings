
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Team {
    public static void main(String[] args) {

        int i = 0;
        int answer = 0;
            try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                int questinsround = Integer.parseInt(bufferedReader.readLine());
                if(questinsround>= 1 && questinsround <= 1000 ) {
                    while (i < questinsround) {
                        int tmp = 0;
                        String[] round = bufferedReader.readLine().split("\\s+");
                        List<Integer> list = new ArrayList<>();
                        for (String number : round) {
                            list.add(Integer.parseInt(number));
                        }
                        for (int j = 0; j < list.size(); j++) {
                            if (list.get(j) == 1)
                                tmp++;
                        }
                        if (tmp >= 2) {
                            answer++;
                        }
                        i++;
                    }
                    System.out.println(answer);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
