(ns kubernetes.specs.v1beta1/network-policy-egress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/network-policy-port :refer :all]
            [kubernetes.specs.v1beta1/network-policy-peer :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/network-policy-egress-rule-data
  {
   (ds/opt :ports) (s/coll-of v1beta1/network-policy-port-spec)
   (ds/opt :to) (s/coll-of v1beta1/network-policy-peer-spec)
   })

(def v1beta1/network-policy-egress-rule-spec
  (ds/spec
    {:name ::v1beta1/network-policy-egress-rule
     :spec v1beta1/network-policy-egress-rule-data}))
