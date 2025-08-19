import java.util.*;
import java.util.stream.IntStream;

class Solution {

    public int solution(int[] A, int[] B) {
        Arrays.sort(A); // A: 오름차순 정렬
        Arrays.sort(B); // B: 오름차순 정렬

        // A의 작은 수 × B의 큰 수 순으로 곱하여 최소 누적합 계산
        return IntStream.range(0, A.length)
                        .map(i -> A[i] * B[B.length - 1 - i])
                        .sum();
    }

}