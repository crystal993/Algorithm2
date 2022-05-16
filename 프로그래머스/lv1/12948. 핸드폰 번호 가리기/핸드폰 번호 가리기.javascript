function solution(phone_number) {
    let front = '*'.repeat(phone_number.length-4);
    let back = phone_number.substring(phone_number.length-4,phone_number.length);
    return front+back;
}