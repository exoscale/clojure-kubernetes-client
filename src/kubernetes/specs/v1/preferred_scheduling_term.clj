(ns kubernetes.specs.v1/preferred-scheduling-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-selector-term :refer :all]
            )
  (:import (java.io File)))


(def v1/preferred-scheduling-term-data
  {
   (ds/req :preference) v1/node-selector-term-spec
   (ds/req :weight) int?
   })

(def v1/preferred-scheduling-term-spec
  (ds/spec
    {:name ::v1/preferred-scheduling-term
     :spec v1/preferred-scheduling-term-data}))
