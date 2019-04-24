(ns clojure-kubernetes-client.specs.networking-v1beta1-http-ingress-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-backend :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-http-ingress-path-data networking-v1beta1-http-ingress-path)
(def networking-v1beta1-http-ingress-path-data
  {
   (ds/req :backend) networking-v1beta1-ingress-backend
   (ds/opt :path) string?
   })

(def networking-v1beta1-http-ingress-path
  (ds/spec
    {:name ::networking-v1beta1-http-ingress-path
     :spec networking-v1beta1-http-ingress-path-data}))

