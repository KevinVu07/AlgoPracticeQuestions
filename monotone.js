let A = [5, 3, 4, 4, 1, 2, 3, 7, 1, 3];
let B = [30, 20, 50];

var monotone = function (arr) {
  let maxAscendingSliceSize = 1;
  let ascendingSliceSize = 1;
  let beginIndex = 0;
  let endIndex = 0;

  for (let i = 0; i < arr.length - 1; i++) {
    if (arr[i] < arr[i + 1]) {
      ascendingSliceSize += 1;
      if (ascendingSliceSize > maxAscendingSliceSize) {
        endIndex = i + 1;
        beginIndex = endIndex - ascendingSliceSize + 1;
        maxAscendingSliceSize = ascendingSliceSize;
      }
    } else if (arr[i] >= arr[i + 1]) {
      endIndex = i;
      if (ascendingSliceSize > maxAscendingSliceSize) {
        beginIndex = endIndex - ascendingSliceSize + 1;
        maxAscendingSliceSize = ascendingSliceSize;
        ascendingSliceSize = 1;
      }
    }
  }

  return beginIndex;
};

console.log(monotone(A));
console.log(monotone(B));
