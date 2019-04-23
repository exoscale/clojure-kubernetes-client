(ns kubernetes.specs.networking/v1beta1/http-ingress-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.networking/v1beta1/ingress-backend :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/http-ingress-path-data
  {
   (ds/req :backend) networking/v1beta1/ingress-backend-spec
   (ds/opt :path) string?
   })

(def networking/v1beta1/http-ingress-path-spec
  (ds/spec
    {:name ::networking/v1beta1/http-ingress-path
     :spec networking/v1beta1/http-ingress-path-data}))
