(ns clojure-kubernetes-client.specs.v1-rule-with-operations
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-rule-with-operations-data v1-rule-with-operations)
(def v1-rule-with-operations-data
  {
   (ds/opt :apiGroups) (s/coll-of string?)
   (ds/opt :apiVersions) (s/coll-of string?)
   (ds/opt :operations) (s/coll-of string?)
   (ds/opt :resources) (s/coll-of string?)
   (ds/opt :scope) string?
   })

(def v1-rule-with-operations
  (ds/spec
    {:name ::v1-rule-with-operations
     :spec v1-rule-with-operations-data}))

