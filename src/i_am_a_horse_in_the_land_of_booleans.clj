(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate
  "doubles it if it is a number,
  returns nil if it is an empty collection,
  if it is a list or a vector, returns two times the length of it
  returns true otherwise."
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year?
  "A year is a leap year if it is divisible by 4,
  except if it is divisible by 100, in which case
  it still is a leap year if it is divisible by 400"
  [year]
  (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))))

; '_______'
