(ns clojure-kubernetes-client.specs.v1beta1-network-policy-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-egress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-network-policy-spec-data v1beta1-network-policy-spec)
(def v1beta1-network-policy-spec-data
  {
   (ds/opt :egress) (s/coll-of v1beta1-network-policy-egress-rule)
   (ds/opt :ingress) (s/coll-of v1beta1-network-policy-ingress-rule)
   (ds/req :podSelector) v1-label-selector
   (ds/opt :policyTypes) (s/coll-of string?)
   })

(def v1beta1-network-policy-spec
  (ds/spec
    {:name ::v1beta1-network-policy-spec
     :spec v1beta1-network-policy-spec-data}))

