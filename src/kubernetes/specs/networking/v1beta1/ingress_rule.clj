(ns kubernetes.specs.networking/v1beta1/ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.networking/v1beta1/http-ingress-rule-value :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/ingress-rule-data
  {
   (ds/opt :host) string?
   (ds/opt :http) networking/v1beta1/http-ingress-rule-value-spec
   })

(def networking/v1beta1/ingress-rule-spec
  (ds/spec
    {:name ::networking/v1beta1/ingress-rule
     :spec networking/v1beta1/ingress-rule-data}))
