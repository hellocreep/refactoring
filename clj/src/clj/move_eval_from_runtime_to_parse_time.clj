(ns clj.move-eval-from-runtime-to-parse-time
  (:gen-class))

(defn my-assert [body description]
  (str description ": " (if (eval body) "passed" "failed")))
