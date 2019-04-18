(ns kubernetes.specs.v1alpha1/rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1alpha1/rule-data
  {
   (ds/opt :apiGroups) (s/coll-of string?)
   (ds/opt :apiVersions) (s/coll-of string?)
   (ds/opt :resources) (s/coll-of string?)
   })

(def v1alpha1/rule-spec
  (ds/spec
    {:name ::v1alpha1/rule
     :spec v1alpha1/rule-data}))
