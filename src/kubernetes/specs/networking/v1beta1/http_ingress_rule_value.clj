(ns kubernetes.specs.networking/v1beta1/http-ingress-rule-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.networking/v1beta1/http-ingress-path :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/http-ingress-rule-value-data
  {
   (ds/req :paths) (s/coll-of networking/v1beta1/http-ingress-path-spec)
   })

(def networking/v1beta1/http-ingress-rule-value-spec
  (ds/spec
    {:name ::networking/v1beta1/http-ingress-rule-value
     :spec networking/v1beta1/http-ingress-rule-value-data}))
