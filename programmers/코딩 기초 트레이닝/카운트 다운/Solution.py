def solution(start_num, end_num):
    answer = list(range(start_num, end_num-1, -1))
    return answer

# 카운트 다운
# list로 반환을 해야하니까 list 사용
# range() 함수를 사용하여 start_num 부터 end_num 까지의 숫자 생성
# 조건은 -1씩 감소