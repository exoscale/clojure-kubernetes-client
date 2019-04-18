(ns kubernetes.specs.v1beta1/network-policy-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/network-policy-egress-rule :refer :all]
            [kubernetes.specs.v1beta1/network-policy-ingress-rule :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/network-policy-spec-data
  {
   (ds/opt :egress) (s/coll-of v1beta1/network-policy-egress-rule-spec)
   (ds/opt :ingress) (s/coll-of v1beta1/network-policy-ingress-rule-spec)
   (ds/req :podSelector) v1/label-selector-spec
   (ds/opt :policyTypes) (s/coll-of string?)
   })

(def v1beta1/network-policy-spec-spec
  (ds/spec
    {:name ::v1beta1/network-policy-spec
     :spec v1beta1/network-policy-spec-data}))
