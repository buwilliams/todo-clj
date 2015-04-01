(ns todo_clj.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [todo_clj.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'todo_clj.core-test))
    0
    1))
