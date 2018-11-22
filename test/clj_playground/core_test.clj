(ns clj-playground.core-test
  (:require [clojure.test :refer :all]
            [clj-playground.core :refer :all]))

(deftest a-test
  (testing "should echo properly"
    (is (= "x" (do-nothing "x")))
    (is (= 1 (do-nothing 1)))
    (is (= 1 (do-nothing 1)))
  )
)


(deftest thing-test
  (testing "always thing"
    (is (= :thing (always-thing)))
    (is (= :thing (always-thing "hey" "ow" 10 10)))
  )
)


(deftest thingy-test
  (testing "always thing"
    (let [n (rand-int Integer/MAX_VALUE)
          f (make-thingy n)]
      (assert (= n (f)))
      (assert (= n (f :foo)))
      (assert (= n (apply f :foo (range))))
    )
  )
)

