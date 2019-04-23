(ns kubernetes.specs.v1alpha1/policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1alpha1/policy-data
  {
   (ds/req :level) string?
   (ds/opt :stages) (s/coll-of string?)
   })

(def v1alpha1/policy-spec
  (ds/spec
    {:name ::v1alpha1/policy
     :spec v1alpha1/policy-data}))
