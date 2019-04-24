(ns clojure-kubernetes-client.manifest
  (:require [clojure-kubernetes-client.core :as core]
            [clojure-kubernetes-client.api.core-v1 :refer [list-node create-namespace]]))

;; Set end-point for the the client globally
(core/set-api-context {:base-url "http://localhost:8080"})

(list-node)
(create-namespace {:metadata {:name "a"}})
