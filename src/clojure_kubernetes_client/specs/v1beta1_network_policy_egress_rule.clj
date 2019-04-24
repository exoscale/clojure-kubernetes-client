(ns clojure-kubernetes-client.specs.v1beta1-network-policy-egress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-port :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-peer :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-network-policy-egress-rule-data v1beta1-network-policy-egress-rule)
(def v1beta1-network-policy-egress-rule-data
  {
   (ds/opt :ports) (s/coll-of v1beta1-network-policy-port)
   (ds/opt :to) (s/coll-of v1beta1-network-policy-peer)
   })

(def v1beta1-network-policy-egress-rule
  (ds/spec
    {:name ::v1beta1-network-policy-egress-rule
     :spec v1beta1-network-policy-egress-rule-data}))

