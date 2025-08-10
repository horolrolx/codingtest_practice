class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int i = num_list.length;
        for(int s = 0; s < i; n++){
            answer[s++] += num_list[n % num_list.length];
        }
        return answer;
    }
}

// n %  num_list.length 를 사용하면
// n번째부터 배열을 반환하면서 num_list의 길이를 넘어가면
// 나머지 연산에 의해 배열의 처음부터 다시 시작하여 원하는 결과가 나온다