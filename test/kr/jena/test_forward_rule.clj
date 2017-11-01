(ns kr.jena.test-forward-rule
  (use clojure.test
       [kr.jena.test-kb :exclude [test-ns-hook]])
  (require kr.core.test-kb
           kr.core.test-forward-rule))

;;; --------------------------------------------------------
;;; 
;;; --------------------------------------------------------

(defn test-ns-hook []
  (binding [kr.core.test-kb/*kb-creator-fn*
            jena-memory-test-kb
            kr.jena.rdf/*force-add-named-to-default*
            true]
    ;;these currently fail because there is a reader and writer
    ;;  going in the same model causing a failure...
    ;;  modification during iteration
    ;;(run-tests 'edu.ucdenver.ccp.test.kr.test-forward-rule)
    ))

;;; --------------------------------------------------------
;;; END
;;; --------------------------------------------------------
