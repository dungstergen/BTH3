const assertNumber = (value, name) => {
  if (typeof value !== 'number' || Number.isNaN(value) || !Number.isFinite(value)) {
    throw new TypeError(`${name} must be a number`);
  }
};

const assertInteger = (value, name) => {
  assertNumber(value, name);
  if (!Number.isInteger(value)) {
    throw new TypeError(`${name} must be an integer`);
  }
};

const rectanglePerimeter = (length, width) => {
  assertNumber(length, 'length');
  assertNumber(width, 'width');
  if (length < 0 || width < 0) {
    throw new RangeError('length and width must be non-negative');
  }
  return 2 * (length + width);
};

const rectangleArea = (length, width) => {
  assertNumber(length, 'length');
  assertNumber(width, 'width');
  if (length < 0 || width < 0) {
    throw new RangeError('length and width must be non-negative');
  }
  return length * width;
};

const solveQuadratic = (a, b, c) => {
  assertNumber(a, 'a');
  assertNumber(b, 'b');
  assertNumber(c, 'c');

  if (a === 0) {
    if (b === 0) {
      throw new RangeError('a and b cannot both be zero');
    }
    return { type: 'linear', roots: [-c / b] };
  }

  const discriminant = b * b - 4 * a * c;
  if (discriminant < 0) {
    return { type: 'complex', roots: [] };
  }
  if (discriminant === 0) {
    return { type: 'double', roots: [-b / (2 * a)] };
  }

  const squareRoot = Math.sqrt(discriminant);
  return {
    type: 'distinct',
    roots: [(-b - squareRoot) / (2 * a), (-b + squareRoot) / (2 * a)],
  };
};

const daysInMonth = (month, year = null) => {
  assertInteger(month, 'month');
  if (month < 1 || month > 12) {
    throw new RangeError('month must be between 1 and 12');
  }

  const daysByMonth = {
    1: 31,
    2: 28,
    3: 31,
    4: 30,
    5: 31,
    6: 30,
    7: 31,
    8: 31,
    9: 30,
    10: 31,
    11: 30,
    12: 31,
  };

  if (month !== 2) {
    return daysByMonth[month];
  }

  if (year === null) {
    return 28;
  }

  assertInteger(year, 'year');
  const isLeapYear = year % 400 === 0 || (year % 4 === 0 && year % 100 !== 0);
  return isLeapYear ? 29 : 28;
};

const isPrime = (value) => {
  assertInteger(value, 'value');
  if (value < 2) {
    return false;
  }
  if (value === 2) {
    return true;
  }
  if (value % 2 === 0) {
    return false;
  }

  const limit = Math.floor(Math.sqrt(value));
  for (let divisor = 3; divisor <= limit; divisor += 2) {
    if (value % divisor === 0) {
      return false;
    }
  }
  return true;
};

const alternatingSum = (n) => {
  assertInteger(n, 'n');
  if (n < 0) {
    throw new RangeError('n must be non-negative');
  }

  let total = 0;
  for (let index = 1; index <= n; index += 1) {
    total += index % 2 === 1 ? index : -index;
  }
  return total;
};

const gcd = (a, b) => {
  assertInteger(a, 'a');
  assertInteger(b, 'b');
  if (a === 0 && b === 0) {
    throw new RangeError('a and b cannot both be zero');
  }

  let first = Math.abs(a);
  let second = Math.abs(b);
  while (second !== 0) {
    const remainder = first % second;
    first = second;
    second = remainder;
  }
  return first;
};

const factorial = (value) => {
  assertInteger(value, 'value');
  if (value < 0) {
    throw new RangeError('value must be non-negative');
  }

  let result = 1;
  for (let index = 2; index <= value; index += 1) {
    result *= index;
  }
  return result;
};

const factorialSum = (n) => {
  assertInteger(n, 'n');
  if (n < 0) {
    throw new RangeError('n must be non-negative');
  }

  let total = 0;
  for (let index = 1; index <= n; index += 1) {
    total += factorial(index);
  }
  return total;
};

module.exports = {
  alternatingSum,
  daysInMonth,
  factorial,
  factorialSum,
  gcd,
  isPrime,
  rectangleArea,
  rectanglePerimeter,
  solveQuadratic,
};