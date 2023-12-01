var binaryGap = function (n) {
  let binaryNumbers = [];
  let quotient = Math.floor(n / 2);
  let remainder = n % 2;
  binaryNumbers.unshift(remainder);

  while (quotient > 0) {
    n = quotient;
    remainder = n % 2;
    quotient = Math.floor(n / 2);
    binaryNumbers.unshift(remainder);
  }

  let leftPointer = binaryNumbers[0];
  let rightPointer = binaryNumbers.length - 1;
  let count = 0;
  let maxDistance = 0;
  let distance = 0;
  for (let i = 0; i < binaryNumbers.length; i++) {
    if (binaryNumbers[i] == 1 && count == 0) {
      leftPointer = i;
      count++;
    } else if (binaryNumbers[i] == 1) {
      rightPointer = i;
      distance = rightPointer - leftPointer;
      leftPointer = rightPointer;
    }
    if (distance > maxDistance) {
      maxDistance = distance;
    }
  }

  longestBinaryGap = maxDistance - 1;

  if (longestBinaryGap > 0) {
    return longestBinaryGap;
  } else {
    return 0;
  }
};

answer = binaryGap(22);
answer2 = binaryGap(8);
answer3 = binaryGap(5);
answer4 = binaryGap(1041);

console.log(answer);
console.log(answer2);
console.log(answer3);
console.log(answer4);
