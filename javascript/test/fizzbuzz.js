const Code = require('code');   // assertion library
const Lab = require('lab');
const lab = exports.lab = Lab.script();

const suite = lab.suite;
const test = lab.test;
const expect = Code.expect;

const fizzBuzz = require("../fizzbuzz")

suite('fizzbuzz', () => {

    test('input of 1 returns 1', (done) => {

        expect(fizzBuzz(1)).to.equal(1);
        done();
    });

    test('input of 3 returns fizz', (done) => {

        expect(fizzBuzz(3)).to.equal("fizz");
        done();
    });

    test('multiple of 3 returns fizz', (done) => {
        expect(fizzBuzz(9)).to.equal("fizz");
        done();
    });

    test('input of 5 returns buzz', (done) => {

        expect(fizzBuzz(5)).to.equal("buzz");
        done();
    });

    test('multiple of 5 returns buzz', (done) => {
        expect(fizzBuzz(10)).to.equal("buzz");
        done();
    });

    test('input of 15 returns fizbuzz', (done) => {

        expect(fizzBuzz(15)).to.equal("fizzbuzz");
        done();
    });

    test('multiple of 15 returns fizbuzz', (done) => {

        expect(fizzBuzz(30)).to.equal("fizzbuzz");
        done();
    });
});