function solution(a, b) {
    let answer = 0;
    let start = a < b ? a : b; //작은 수
    let end = a > b ? a : b; //큰 수
    
    for(let i = start; i <= end; i++){
        answer += i; //합
    }
    return answer;
}