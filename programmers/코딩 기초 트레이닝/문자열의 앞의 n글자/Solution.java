class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int i = 0;
        while(n-- > 0){
            answer += my_string.charAt(i++);
        }
        return answer;
    }
}

// 나는 charAt() 메서드를 사용해서 n번째까지의 글자를 하나씩
// answer에 더해서 반환했다.
// substring(start, end) 메서드를 사용하면 더 간결하게 코드 작성 가능