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


(deftest list-replication-test
  (testing "list replication"
    (let [n 3
          l '(1, 2, 3, 4)
          expected '(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4)]
      (is (= expected (list-replication n l)))
    )
  )
)

