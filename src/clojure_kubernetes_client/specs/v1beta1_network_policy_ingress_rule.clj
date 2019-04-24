(ns clojure-kubernetes-client.specs.v1beta1-network-policy-ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-peer :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-port :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-network-policy-ingress-rule-data v1beta1-network-policy-ingress-rule)
(def v1beta1-network-policy-ingress-rule-data
  {
   (ds/opt :from) (s/coll-of v1beta1-network-policy-peer)
   (ds/opt :ports) (s/coll-of v1beta1-network-policy-port)
   })

(def v1beta1-network-policy-ingress-rule
  (ds/spec
    {:name ::v1beta1-network-policy-ingress-rule
     :spec v1beta1-network-policy-ingress-rule-data}))

