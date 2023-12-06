// Given positive integers A and B (A <= B), return number of prime number within the range (both ends are included in the range)

/* pseudo-code
First few prime numbers are 2, 3, 5, 7
After that, prime numbers are:
 - odd number
 - can't be divided by 2, 3, 5, 7
*/

var primeSimple = function (A, B) {
  // Create an array where each element starts as true
  const range = B - A;
  const arrLen = range + 1;

  const numsArr = Array.from({ length: B + 1 }, () => true);

  const primeNumbers = [];

  for (let i = 2; i <= B; i++) {
    if (numsArr[i] && i >= A) {
      primeNumbers.push(i);
      // console.log(primeNumbers);
    }

    /* 
      convert all elements in the numsArr 
      whose indexes are multiples of i 
      to false
      */
    for (let j = i + i; j <= B; j += i) {
      numsArr[j] = false;
    }
  }
  console.log(numsArr);
  // console.log(primeNumbers);
  return primeNumbers.length;
};

answer1 = primeSimple(1, 10);
answer2 = primeSimple(1, 20);
answer3 = primeSimple(10, 20);
answer4 = primeSimple(11, 11);
answer5 = primeSimple(1, 5);

console.log(answer1, answer2, answer3, answer4, answer5);
