(ns clj.move-eval-from-runtime-to-parse-time
  (:gen-class))

; (defn my-assert [body description]
;   (str description ": " (if (eval body) "passed" "failed")))

(defmacro my-assert [body description]
  `(let [result# ~body]
     (str ~description ": " (if result# "passed" "failed"))))

; (macroexpand '((my-assert (= 2 (+ 1 1)) "1 + 1 should return 2")))
; => (let* [result__225__auto__ (= 2 (+ 1 1))]
; =>   (clojure.core/str 1 + 1 should return 2 :  (if result__225__auto__ passed failed))
