(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-backend-data extensions-v1beta1-ingress-backend)
(def extensions-v1beta1-ingress-backend-data
  {
   (ds/req :serviceName) string?
   (ds/req :servicePort) any?
   })

(def extensions-v1beta1-ingress-backend
  (ds/spec
    {:name ::extensions-v1beta1-ingress-backend
     :spec extensions-v1beta1-ingress-backend-data}))

