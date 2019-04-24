(ns clojure-kubernetes-client.specs.extensions-v1beta1-http-ingress-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-backend :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-http-ingress-path-data extensions-v1beta1-http-ingress-path)
(def extensions-v1beta1-http-ingress-path-data
  {
   (ds/req :backend) extensions-v1beta1-ingress-backend
   (ds/opt :path) string?
   })

(def extensions-v1beta1-http-ingress-path
  (ds/spec
    {:name ::extensions-v1beta1-http-ingress-path
     :spec extensions-v1beta1-http-ingress-path-data}))

