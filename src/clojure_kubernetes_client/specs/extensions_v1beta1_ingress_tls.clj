(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress-tls
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-tls-data extensions-v1beta1-ingress-tls)
(def extensions-v1beta1-ingress-tls-data
  {
   (ds/opt :hosts) (s/coll-of string?)
   (ds/opt :secretName) string?
   })

(def extensions-v1beta1-ingress-tls
  (ds/spec
    {:name ::extensions-v1beta1-ingress-tls
     :spec extensions-v1beta1-ingress-tls-data}))

