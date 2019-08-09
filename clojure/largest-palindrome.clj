(defn my-string [string] 
  (reverse (reverse string)))

(defn palindrome [i j]
  (if (= (my-string (str (* i j))) (reverse (my-string (str (* i j)))))
    (* i j)
    nil))

(->>
  (map (fn [i]
         (map (fn [j]
                (palindrome i j )) (range 999 99 -1))) (range 999 99 -1))
  flatten
  (filter (fn [x] (not (nil? x))))
  (apply max)
  println)
