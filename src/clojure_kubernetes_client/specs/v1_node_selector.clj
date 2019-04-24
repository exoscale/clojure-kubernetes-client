(ns clojure-kubernetes-client.specs.v1-node-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-selector-term :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-selector-data v1-node-selector)
(def v1-node-selector-data
  {
   (ds/req :nodeSelectorTerms) (s/coll-of v1-node-selector-term)
   })

(def v1-node-selector
  (ds/spec
    {:name ::v1-node-selector
     :spec v1-node-selector-data}))

