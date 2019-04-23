(ns kubernetes.specs.extensions/v1beta1/http-ingress-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/ingress-backend :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/http-ingress-path-data
  {
   (ds/req :backend) extensions/v1beta1/ingress-backend-spec
   (ds/opt :path) string?
   })

(def extensions/v1beta1/http-ingress-path-spec
  (ds/spec
    {:name ::extensions/v1beta1/http-ingress-path
     :spec extensions/v1beta1/http-ingress-path-data}))
