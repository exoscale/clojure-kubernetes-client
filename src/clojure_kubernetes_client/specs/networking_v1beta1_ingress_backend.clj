(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-backend-data networking-v1beta1-ingress-backend)
(def networking-v1beta1-ingress-backend-data
  {
   (ds/req :serviceName) string?
   (ds/req :servicePort) any?
   })

(def networking-v1beta1-ingress-backend
  (ds/spec
    {:name ::networking-v1beta1-ingress-backend
     :spec networking-v1beta1-ingress-backend-data}))

