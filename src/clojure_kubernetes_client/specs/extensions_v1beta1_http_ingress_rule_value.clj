(ns clojure-kubernetes-client.specs.extensions-v1beta1-http-ingress-rule-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-http-ingress-path :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-http-ingress-rule-value-data extensions-v1beta1-http-ingress-rule-value)
(def extensions-v1beta1-http-ingress-rule-value-data
  {
   (ds/req :paths) (s/coll-of extensions-v1beta1-http-ingress-path)
   })

(def extensions-v1beta1-http-ingress-rule-value
  (ds/spec
    {:name ::extensions-v1beta1-http-ingress-rule-value
     :spec extensions-v1beta1-http-ingress-rule-value-data}))

