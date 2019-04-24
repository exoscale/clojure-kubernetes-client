(ns clojure-kubernetes-client.specs.v1-preferred-scheduling-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-selector-term :refer :all]
            )
  (:import (java.io File)))


(declare v1-preferred-scheduling-term-data v1-preferred-scheduling-term)
(def v1-preferred-scheduling-term-data
  {
   (ds/req :preference) v1-node-selector-term
   (ds/req :weight) int?
   })

(def v1-preferred-scheduling-term
  (ds/spec
    {:name ::v1-preferred-scheduling-term
     :spec v1-preferred-scheduling-term-data}))

