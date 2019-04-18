(ns kubernetes.specs.v1beta1/ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/ingress-backend-data
  {
   (ds/req :serviceName) string?
   (ds/req :servicePort) any?
   })

(def v1beta1/ingress-backend-spec
  (ds/spec
    {:name ::v1beta1/ingress-backend
     :spec v1beta1/ingress-backend-data}))
