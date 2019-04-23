(ns kubernetes.specs.v1/pod-affinity-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-affinity-term-data
  {
   (ds/opt :labelSelector) v1/label-selector-spec
   (ds/opt :namespaces) (s/coll-of string?)
   (ds/req :topologyKey) string?
   })

(def v1/pod-affinity-term-spec
  (ds/spec
    {:name ::v1/pod-affinity-term
     :spec v1/pod-affinity-term-data}))
