(ns fizzbuzz.core)

(defn nondry-fizzbuzz [x]
  (cond (zero? (mod x 15)) "FizzBuzz"
        (zero? (mod x 3)) "Fizz"
        (zero? (mod x 5)) "Buzz"
        :else (str x) )
)

(defn fizzbuzz [x]
  (let [ acc
         (str (if (zero? (mod x 3)) "Fizz")
              (if (zero? (mod x 5)) "Buzz"))]
   (if (empty? acc) (str x) (str acc)  )
  )
)

(take 10(map fizzbuzz (iterate inc 1)))
(map fizzbuzz (range 1 100))

(fizzbuzz 3)
(fizzbuzz 4)
(fizzbuzz 5)
(fizzbuzz 6)
(fizzbuzz 10)
(fizzbuzz 15)