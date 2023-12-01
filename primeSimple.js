// Given positive integers A and B (A <= B), return number of prime number within the range (both ends are included in the range)

/* pseudo-code
First few prime numbers are 2, 3, 5, 7
After that, prime numbers are:
 - odd number
 - can't be divided by 2, 3, 5, 7
*/

var primeSimple = function (A, B) {
  let numberOfPrimeNumbers = 0;

  if (A <= 7 && B <= 7) {
    for (let i = A; i <= B; i++) {
      if (i == 2 || i == 3 || i == 5 || i == 7) {
        numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
      }
    }
  } else if (A < 2 && B > 7) {
    numberOfPrimeNumbers = 4;
    for (let i = 8; i <= B; i += 2) {
      if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
        numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
      }
    }
  } else if (A > 7 && A % 2 == 1) {
    for (let i = A; i <= B; i += 2) {
      if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
        numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
      }
    }
  } else if (A > 7 && A % 2 == 0) {
    for (let i = A + 1; i <= B; i += 2) {
      if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
        numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
      }
    }
  }
  return numberOfPrimeNumbers;
};

answer1 = primeSimple(1, 10);
answer2 = primeSimple(1, 20);
answer3 = primeSimple(10, 20);
answer4 = primeSimple(11, 11);
answer5 = primeSimple(1, 5);

console.log(answer1, answer2, answer3, answer4, answer5);
