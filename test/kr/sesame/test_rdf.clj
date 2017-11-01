(ns kr.sesame.test-rdf
  (:require [clojure.test :refer [run-tests]]
            [kr.core.test-kb :refer [*kb-creator-fn*]]
            kr.core.test-rdf
            [kr.sesame.test-kb :refer [sesame-memory-test-kb]]))

(def sesame-kb-creator-fn sesame-memory-test-kb)

(defn test-ns-hook []
  (binding [*kb-creator-fn* sesame-kb-creator-fn]
    (run-tests 'kr.core.test-rdf)))

;; --- REPL ------------------------------------------------------------------

(comment {:desc "Eval (CIDER: C-c C-e) the form (denoted by `:eval`) at the
   REPL to install the creator function such that the core test-kb tests can be
   run individually at the REPL."
          :eval (alter-var-root #'edu.ucdenver.ccp.test.kr.test-kb/*kb-creator-fn*
                                (fn [_] sesame-kb-creator-fn))})