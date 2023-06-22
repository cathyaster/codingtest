import java.util.Scanner;

public class B1016 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();

        boolean[] Check = new boolean[(int) (max - min + 1)];

        for (long i = 2; i * i <= max; i++) {
            long jegob = i * i;
            long start_index = min / jegob; //제곱수의 배수
            if (min % jegob != 0) //제곱수 배수 아니면
                start_index++;
                for (long j = start_index; jegob * j <= max; j++) { //제곱수에 start index 곱하는 이유...?
                    Check[(int) ((j * jegob) - min)] = true; //boolean은 초기값 false로 지정됨
                }
            }
            int cnt = 0; //초기화
            for (int i=0; i <= max - min; i++) {
                if (!Check[i]) { //! -> not (제곱이 아닌수)
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }