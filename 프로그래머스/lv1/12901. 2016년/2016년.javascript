function solution(a, b) {
    let day = ['THU','FRI','SAT','SUN','MON','TUE','WED'];
    let b_arr = [0,31,29,31,30,31,30,31,31,30,31,30,31];
    let answer = 0;
for(let i = 0; i < a; i++){
    answer += b_arr[i];
}
answer += b;
    return day[answer % 7];
}