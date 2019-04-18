(ns kubernetes.specs.v1/node-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-config-source :refer :all]
            [kubernetes.specs.v1/taint :refer :all]
            )
  (:import (java.io File)))


(def v1/node-spec-data
  {
   (ds/opt :configSource) v1/node-config-source-spec
   (ds/opt :externalID) string?
   (ds/opt :podCIDR) string?
   (ds/opt :providerID) string?
   (ds/opt :taints) (s/coll-of v1/taint-spec)
   (ds/opt :unschedulable) boolean?
   })

(def v1/node-spec-spec
  (ds/spec
    {:name ::v1/node-spec
     :spec v1/node-spec-data}))
