(ns kubernetes.specs.v1beta1/network-policy-ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/network-policy-peer :refer :all]
            [kubernetes.specs.v1beta1/network-policy-port :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/network-policy-ingress-rule-data
  {
   (ds/opt :from) (s/coll-of v1beta1/network-policy-peer-spec)
   (ds/opt :ports) (s/coll-of v1beta1/network-policy-port-spec)
   })

(def v1beta1/network-policy-ingress-rule-spec
  (ds/spec
    {:name ::v1beta1/network-policy-ingress-rule
     :spec v1beta1/network-policy-ingress-rule-data}))
