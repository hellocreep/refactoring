(ns clj.move-eval-from-runtime-to-parse-time-test
  (:require [clojure.test :refer :all]
            [clj.move-eval-from-runtime-to-parse-time :refer :all]))

(defn time-test []
  (dotimes [_ 10000]
    (my-assert '(= 2 (+ 1 1)) "1 + 1 should return 2"))
  nil)


(deftest test-assert
  (testing "my-assert should return passed infos when test passed"
    (is (= (my-assert '(= 2 (+ 1 1)) "1 + 1 should return 2") "1 + 1 should return 2: passed")))
  (testing "my-assert should return failed infos when test passed"
    (is (= (my-assert '(= 3 (+ 1 1)) "1 + 1 should return 2") "1 + 1 should return 2: failed")))
  (testing "my-assert runs 10000 times time"
    (time (time-test))
    (is true)))
