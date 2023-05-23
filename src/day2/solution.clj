(ns day2.solution
  (:require [clojure.string :as cstr]))


(def input (slurp "./src/day2/input-big.txt"))

(def winning-combination {["A" "Y"] 8
                          ["B" "Z"] 9
                          ["C" "X"] 1
                          ["C" "Y"] 5
                          ["B" "X"] 1
                          ["A" "Z"] 3
                          ["A" "X"] 4
                          ["B" "Y"] 5
                          ["C" "Z"] 6})

(def winning-combination1 {["A" "X"] 3
                           ["A" "Y"] 4
                           ["A" "Z"] 7
                           ["B" "X"] 1
                           ["B" "Y"] 5
                           ["B" "Z"] 9
                           ["C" "X"] 2
                           ["C" "Y"] 6
                           ["C" "Z"] 7})


(let [inp (cstr/split input #"\n")]
  (->> (map #(cstr/split % #" ") inp)
       (map #(winning-combination %))
       (apply +)))

(let [inp (cstr/split input #"\n")]
  (->> (map #(cstr/split % #" ") inp)
       (map #(winning-combination1 %))
       (apply +)))
