(ns kubernetes.specs.networking/v1beta1/ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/ingress-backend-data
  {
   (ds/req :serviceName) string?
   (ds/req :servicePort) any?
   })

(def networking/v1beta1/ingress-backend-spec
  (ds/spec
    {:name ::networking/v1beta1/ingress-backend
     :spec networking/v1beta1/ingress-backend-data}))
