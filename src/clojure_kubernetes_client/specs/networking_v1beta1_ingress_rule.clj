(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.networking-v1beta1-http-ingress-rule-value :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-rule-data networking-v1beta1-ingress-rule)
(def networking-v1beta1-ingress-rule-data
  {
   (ds/opt :host) string?
   (ds/opt :http) networking-v1beta1-http-ingress-rule-value
   })

(def networking-v1beta1-ingress-rule
  (ds/spec
    {:name ::networking-v1beta1-ingress-rule
     :spec networking-v1beta1-ingress-rule-data}))

