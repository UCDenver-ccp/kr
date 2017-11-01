(ns kr.jena.test-kb
  (use clojure.test
       kr.core.kb
       kr.jena.kb)
  (require kr.core.test-kb
           kr.jena.rdf))

(defn jena-memory-test-kb []
  (kb :jena-mem))

(defn test-ns-hook []
  (binding [kr.core.test-kb/*kb-creator-fn*
            jena-memory-test-kb
            kr.jena.rdf/*force-add-named-to-default*
            true]
    (run-tests 'kr.core.test-kb)))
