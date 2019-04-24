(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-tls
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-tls-data networking-v1beta1-ingress-tls)
(def networking-v1beta1-ingress-tls-data
  {
   (ds/opt :hosts) (s/coll-of string?)
   (ds/opt :secretName) string?
   })

(def networking-v1beta1-ingress-tls
  (ds/spec
    {:name ::networking-v1beta1-ingress-tls
     :spec networking-v1beta1-ingress-tls-data}))

