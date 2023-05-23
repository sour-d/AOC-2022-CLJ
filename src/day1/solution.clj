(ns day1.solution
  (:require [clojure.string :as cstr]))

(def input (slurp "./src/day1/input-big.txt"))

(->> (cstr/split input #"\n")
     (partition-by empty?)
     (take-nth 2)
     (map #(map read-string %))
     (map #(apply + %))
     (apply max))

(->> (cstr/split input #"\n")
     (partition-by empty?)
     (take-nth 2)
     (map #(map read-string %))
     (map #(apply + %))
     (sort #(- %2 %1))
     (take 3)
     (apply +))
