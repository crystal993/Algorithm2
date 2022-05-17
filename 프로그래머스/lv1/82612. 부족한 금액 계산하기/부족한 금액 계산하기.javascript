function solution(price, money, count) {   let sum_price = 0;
    for(let i = 1; i <= count; i++){
        sum_price += price * i;
    }
    if(money < sum_price) return sum_price - money;
    else return 0;
}