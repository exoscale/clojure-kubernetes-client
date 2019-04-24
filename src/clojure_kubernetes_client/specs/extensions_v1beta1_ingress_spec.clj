(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-backend :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-tls :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-spec-data extensions-v1beta1-ingress-spec)
(def extensions-v1beta1-ingress-spec-data
  {
   (ds/opt :backend) extensions-v1beta1-ingress-backend
   (ds/opt :rules) (s/coll-of extensions-v1beta1-ingress-rule)
   (ds/opt :tls) (s/coll-of extensions-v1beta1-ingress-tls)
   })

(def extensions-v1beta1-ingress-spec
  (ds/spec
    {:name ::extensions-v1beta1-ingress-spec
     :spec extensions-v1beta1-ingress-spec-data}))

