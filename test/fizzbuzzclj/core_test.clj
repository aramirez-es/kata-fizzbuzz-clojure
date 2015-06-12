(ns fizzbuzzclj.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzzclj.core :refer :all]))

(deftest a-test
  (testing "return the number when number is not multiple of three"
    (is (= "1" (fizzbuzz 1)))
    (is (= "2" (fizzbuzz 2)))
    (is (= "4" (fizzbuzz 4))))
  (testing "return fizz when number is multiple of three"
    (is (= "Fizz", (fizzbuzz 3)))
    (is (= "Fizz", (fizzbuzz 6))))
  (testing "return buzz when number is multiple of five"
    (is (= "Buzz", (fizzbuzz 5)))
    (is (= "Buzz", (fizzbuzz 10)))
    (is (= "Buzz", (fizzbuzz 20))))
  (testing "return fizzbuzz when number is multiple of both three and five"
    (is (= "FizzBuzz", (fizzbuzz 15)))
    (is (= "FizzBuzz", (fizzbuzz 30)))))
