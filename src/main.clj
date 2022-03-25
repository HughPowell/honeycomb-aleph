(ns main
  (:gen-class)
  (:require [aleph.http :as http]))

(defn -main [& _]
  (-> {:request-method "get"
       :url            "http://www.example.com"}
      http/request
      deref
      :body
      slurp
      println))
