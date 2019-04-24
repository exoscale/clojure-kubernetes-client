(ns clojure-kubernetes-client.specs.v1-container-state
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-container-state-running :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state-terminated :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state-waiting :refer :all]
            )
  (:import (java.io File)))


(declare v1-container-state-data v1-container-state)
(def v1-container-state-data
  {
   (ds/opt :running) v1-container-state-running
   (ds/opt :terminated) v1-container-state-terminated
   (ds/opt :waiting) v1-container-state-waiting
   })

(def v1-container-state
  (ds/spec
    {:name ::v1-container-state
     :spec v1-container-state-data}))

