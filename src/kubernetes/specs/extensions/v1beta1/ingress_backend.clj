(ns kubernetes.specs.extensions/v1beta1/ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/ingress-backend-data
  {
   (ds/req :serviceName) string?
   (ds/req :servicePort) any?
   })

(def extensions/v1beta1/ingress-backend-spec
  (ds/spec
    {:name ::extensions/v1beta1/ingress-backend
     :spec extensions/v1beta1/ingress-backend-data}))
