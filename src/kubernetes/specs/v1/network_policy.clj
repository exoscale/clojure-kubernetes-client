(ns kubernetes.specs.v1/network-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/network-policy-spec :refer :all]
            )
  (:import (java.io File)))


(def v1/network-policy-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/network-policy-spec-spec
   })

(def v1/network-policy-spec
  (ds/spec
    {:name ::v1/network-policy
     :spec v1/network-policy-data}))
