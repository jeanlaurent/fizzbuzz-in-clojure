(ns fizzbuzz.core-test
  (:use clojure.test
        fizzbuzz.core))

(deftest a-test

  (testing "Return 1 for 1"
    (is (= (fizzbuzz 1) "1")))

  (testing "Return 2 for 2"
    (is (= (fizzbuzz 2) "2")))

  (testing "Return Fizz for 3"
    (is (= (fizzbuzz 3) "Fizz")))

  (testing "Return Buzz for 5"
    (is (= (fizzbuzz 5) "Buzz")))

  (testing "Return Fizz for 6"
    (is (= (fizzbuzz 6) "Fizz")))

  (testing "Return Buzz for 10"
    (is (= (fizzbuzz 10) "Buzz")))

  (testing "Return FizzBuzz for 15"
    (is (= (fizzbuzz 15) "FizzBuzz")))


 )
