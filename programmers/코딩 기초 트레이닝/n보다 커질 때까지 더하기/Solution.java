class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
        while(answer <= n){
            answer += numbers[i++];
        }
        return answer;
    }
}

// 5번째 줄에 i < numbers.length 라는 조건을 추가하는게 좋다.
// 배열의 길이를 벗어나는 경우를 방지하기 위해서다.