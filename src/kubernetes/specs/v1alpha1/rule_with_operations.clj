(ns kubernetes.specs.v1alpha1/rule-with-operations
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1alpha1/rule-with-operations-data
  {
   (ds/opt :apiGroups) (s/coll-of string?)
   (ds/opt :apiVersions) (s/coll-of string?)
   (ds/opt :operations) (s/coll-of string?)
   (ds/opt :resources) (s/coll-of string?)
   })

(def v1alpha1/rule-with-operations-spec
  (ds/spec
    {:name ::v1alpha1/rule-with-operations
     :spec v1alpha1/rule-with-operations-data}))
