(ns kubernetes.specs.extensions/v1beta1/http-ingress-rule-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/http-ingress-path :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/http-ingress-rule-value-data
  {
   (ds/req :paths) (s/coll-of extensions/v1beta1/http-ingress-path-spec)
   })

(def extensions/v1beta1/http-ingress-rule-value-spec
  (ds/spec
    {:name ::extensions/v1beta1/http-ingress-rule-value
     :spec extensions/v1beta1/http-ingress-rule-value-data}))
