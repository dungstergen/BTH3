const test = require('node:test');
const assert = require('node:assert/strict');

const {
  alternatingSum,
  daysInMonth,
  factorial,
  factorialSum,
  gcd,
  isPrime,
  rectangleArea,
  rectanglePerimeter,
  solveQuadratic,
} = require('../src/bth3');

test('rectangle perimeter returns valid result', () => {
  assert.equal(rectanglePerimeter(5, 3), 16);
});

test('rectangle area returns valid result', () => {
  assert.equal(rectangleArea(5, 3), 15);
});

test('rectangle area rejects negative dimensions', () => {
  assert.throws(() => rectangleArea(-1, 3), RangeError);
});

test('quadratic equation with two distinct roots', () => {
  const result = solveQuadratic(1, -3, 2);
  assert.equal(result.type, 'distinct');
  assert.deepEqual(result.roots, [1, 2]);
});

test('quadratic equation with double root', () => {
  const result = solveQuadratic(1, 2, 1);
  assert.equal(result.type, 'double');
  assert.deepEqual(result.roots, [-1]);
});

test('quadratic equation becomes linear when a is zero', () => {
  const result = solveQuadratic(0, 2, -4);
  assert.equal(result.type, 'linear');
  assert.deepEqual(result.roots, [2]);
});

test('quadratic equation rejects invalid coefficients', () => {
  assert.throws(() => solveQuadratic(0, 0, 1), RangeError);
});

test('days in month returns standard month length', () => {
  assert.equal(daysInMonth(4), 30);
});

test('days in month returns leap year February', () => {
  assert.equal(daysInMonth(2, 2024), 29);
});

test('days in month rejects invalid month', () => {
  assert.throws(() => daysInMonth(13), RangeError);
});

test('prime check returns true for prime number', () => {
  assert.equal(isPrime(29), true);
});

test('prime check returns false for non-prime number', () => {
  assert.equal(isPrime(21), false);
});

test('prime check handles lower boundary', () => {
  assert.equal(isPrime(1), false);
});

test('alternating sum returns valid result', () => {
  assert.equal(alternatingSum(5), 3);
});

test('alternating sum handles zero', () => {
  assert.equal(alternatingSum(0), 0);
});

test('alternating sum rejects negative input', () => {
  assert.throws(() => alternatingSum(-1), RangeError);
});

test('gcd returns common divisor', () => {
  assert.equal(gcd(24, 18), 6);
});

test('gcd handles zero and a number', () => {
  assert.equal(gcd(0, 15), 15);
});

test('gcd rejects both zeros', () => {
  assert.throws(() => gcd(0, 0), RangeError);
});

test('factorial returns valid result', () => {
  assert.equal(factorial(5), 120);
});

test('factorial handles zero', () => {
  assert.equal(factorial(0), 1);
});

test('factorial rejects negative input', () => {
  assert.throws(() => factorial(-3), RangeError);
});

test('factorial sum returns valid result', () => {
  assert.equal(factorialSum(4), 33);
});

test('factorial sum handles zero', () => {
  assert.equal(factorialSum(0), 0);
});

test('factorial sum rejects negative input', () => {
  assert.throws(() => factorialSum(-2), RangeError);
});