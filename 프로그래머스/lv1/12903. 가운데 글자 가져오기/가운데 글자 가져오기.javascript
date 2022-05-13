function solution(s) {
    let answer, mid;
    if(s.length % 2 == 1){
        mid = parseInt(s.length/2);
        answer = s.charAt(mid);
    } else {
        mid = parseInt(s.length/2 -1);
        answer = s.substring(mid,mid+2);
    }
    return answer;
}