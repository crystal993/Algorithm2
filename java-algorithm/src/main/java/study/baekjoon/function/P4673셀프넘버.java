package study.baekjoon.function;

public class P4673셀프넘버 { //30분이상
    // 셀프넘버가 아닌 수를 구하기
    // 2 = 1+1 (셀프넘버)
    // 4 = 2+2 (셀프넘버)
    // 33 = 3+3 (셀프넘버)
    // 10001개의 배열을 선언하고
    // 각 자리의 수를 더하고 반환
    // 셀프넘버이면 true, 아니면 false
    private boolean[] solution(int n, boolean[] arr) {
        for (int i = 1; i < n; i++) {
            int sum = i, idx = i; //i를 직접쓰면 영향이 있음.
            while (true){
                if(idx==0) break; //0이 되면 break
                sum += idx % 10; //1의 자리 더해주기
                idx = idx / 10; //한 자리씩 없애주기
            }
            if(sum <= n){
                arr[sum] = true;//셀프넘버인 곳을 true로
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        P4673셀프넘버 T = new P4673셀프넘버();
        int n = 10001;
        boolean arr[] = new boolean[n+1];
        arr = T.solution(n, arr);

        for (int i = 1; i < n; i++) {
            if(!arr[i]) System.out.println(i); //false인 인덱스만 출력
        }
    }
}
