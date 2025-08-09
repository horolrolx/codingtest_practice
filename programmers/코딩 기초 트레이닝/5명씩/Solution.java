class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length+4) / 5];
        for(int i = 0; i < names.length; i+=5){
            answer[i/5] = names[i];
        }
        return answer;
    }
}

// 3번 째 줄에 names 길이에 4를 더한 이유는
// 만약 names의 길이가 5 미만 이라면 배열을 생성하지 못하기 때문에
// 최소 하나의 요소를 담기 위해서 4를 더했다