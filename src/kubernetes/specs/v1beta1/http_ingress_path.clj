(ns kubernetes.specs.v1beta1/http-ingress-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/ingress-backend :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/http-ingress-path-data
  {
   (ds/req :backend) v1beta1/ingress-backend-spec
   (ds/opt :path) string?
   })

(def v1beta1/http-ingress-path-spec
  (ds/spec
    {:name ::v1beta1/http-ingress-path
     :spec v1beta1/http-ingress-path-data}))
