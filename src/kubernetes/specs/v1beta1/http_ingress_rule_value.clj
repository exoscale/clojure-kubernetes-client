(ns kubernetes.specs.v1beta1/http-ingress-rule-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/http-ingress-path :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/http-ingress-rule-value-data
  {
   (ds/req :paths) (s/coll-of v1beta1/http-ingress-path-spec)
   })

(def v1beta1/http-ingress-rule-value-spec
  (ds/spec
    {:name ::v1beta1/http-ingress-rule-value
     :spec v1beta1/http-ingress-rule-value-data}))
