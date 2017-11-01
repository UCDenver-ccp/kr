
(ns kr.sesame.test-forward-rule
  (use clojure.test
       [kr.sesame.test-kb :exclude [test-ns-hook]])
  (require kr.core.test-kb
           kr.core.test-forward-rule))

(defn test-ns-hook []
    (binding [kr.core.test-kb/*kb-creator-fn*
            sesame-memory-test-kb]
      (run-tests 'kr.core.test-forward-rule)))
