(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-http-ingress-rule-value :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-rule-data extensions-v1beta1-ingress-rule)
(def extensions-v1beta1-ingress-rule-data
  {
   (ds/opt :host) string?
   (ds/opt :http) extensions-v1beta1-http-ingress-rule-value
   })

(def extensions-v1beta1-ingress-rule
  (ds/spec
    {:name ::extensions-v1beta1-ingress-rule
     :spec extensions-v1beta1-ingress-rule-data}))

