(ns clojure-kubernetes-client.specs.networking-v1beta1-http-ingress-rule-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.networking-v1beta1-http-ingress-path :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-http-ingress-rule-value-data networking-v1beta1-http-ingress-rule-value)
(def networking-v1beta1-http-ingress-rule-value-data
  {
   (ds/req :paths) (s/coll-of networking-v1beta1-http-ingress-path)
   })

(def networking-v1beta1-http-ingress-rule-value
  (ds/spec
    {:name ::networking-v1beta1-http-ingress-rule-value
     :spec networking-v1beta1-http-ingress-rule-value-data}))

