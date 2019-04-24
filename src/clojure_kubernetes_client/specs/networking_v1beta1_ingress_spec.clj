(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-backend :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-tls :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-spec-data networking-v1beta1-ingress-spec)
(def networking-v1beta1-ingress-spec-data
  {
   (ds/opt :backend) networking-v1beta1-ingress-backend
   (ds/opt :rules) (s/coll-of networking-v1beta1-ingress-rule)
   (ds/opt :tls) (s/coll-of networking-v1beta1-ingress-tls)
   })

(def networking-v1beta1-ingress-spec
  (ds/spec
    {:name ::networking-v1beta1-ingress-spec
     :spec networking-v1beta1-ingress-spec-data}))

