(ns fizzbuzzclj.core)

(defn divisibleBy?
  [x]
  (fn [y] (= (mod y x) 0)))

(def divisibleBy3?
  (divisibleBy? 3))

(def divisibleBy5?
  (divisibleBy? 5))

(def divisibleBy15?
  (divisibleBy? 15))

(defn fizzbuzz
  [x]
  (cond
     (divisibleBy15? x) "FizzBuzz"
     (divisibleBy3? x) "Fizz"
     (divisibleBy5? x) "Buzz"
     :else (str x)))
