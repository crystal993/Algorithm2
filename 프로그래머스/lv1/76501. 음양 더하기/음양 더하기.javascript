function solution(absolutes, signs) {
    var answer = 0;
    while(absolutes.length > 0){
        if(!signs.shift()) answer += "-";
        else answer += "+";
        answer += absolutes.shift();
    }
    return eval(answer);
}