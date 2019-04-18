(ns kubernetes.specs.v1/node-selector-requirement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/node-selector-requirement-data
  {
   (ds/req :key) string?
   (ds/req :operator) string?
   (ds/opt :values) (s/coll-of string?)
   })

(def v1/node-selector-requirement-spec
  (ds/spec
    {:name ::v1/node-selector-requirement
     :spec v1/node-selector-requirement-data}))
