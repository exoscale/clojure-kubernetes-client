(ns kubernetes.specs.v1/node-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-selector-term :refer :all]
            )
  (:import (java.io File)))


(def v1/node-selector-data
  {
   (ds/req :nodeSelectorTerms) (s/coll-of v1/node-selector-term-spec)
   })

(def v1/node-selector-spec
  (ds/spec
    {:name ::v1/node-selector
     :spec v1/node-selector-data}))
