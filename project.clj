(defproject edu.ucdenver.ccp/kr "1.5.0-SNAPSHOT"
  :description "knowledge representation and reasoning tools"
  :url "https://github.com/UCDenver-ccp/kr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
           [org.clojure/java.classpath "0.1.0"]
           [org.openrdf.sesame/sesame-runtime "4.1.2"]
           [org.apache.jena/jena-arq "2.10.1"]
           [log4j/log4j "1.2.17"]
           [commons-logging/commons-logging "1.1.1"]
           [commons-codec/commons-codec "1.6"]
           [com.stuartsierra/dependency "0.1.1"]
           [org.slf4j/slf4j-log4j12 "1.7.2"]
           [junit/junit "3.8.1"]]
  :main nil
  :source-paths ["src" "test"] ;; figure out how to make a test-jar using a profile
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

