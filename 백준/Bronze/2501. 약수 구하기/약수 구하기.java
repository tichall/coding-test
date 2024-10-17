import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // n과 k를 입력받는다.
        // n의 약수를 구한다. (이는 작은 순서대로..)
        // 약수 리스트의 k-1번째 인덱스를 추출한다.

        // 굳이 다른 약수까지 저장할 필요가 없다!
        // 카운트로 몇 번째인지 세고만 있다가 k번째일 때 값을 반환하고 바로 끝내버리면 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0; // 1은 기본으로 포함
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == k) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}