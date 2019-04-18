(ns kubernetes.specs.v1beta1/ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/http-ingress-rule-value :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/ingress-rule-data
  {
   (ds/opt :host) string?
   (ds/opt :http) v1beta1/http-ingress-rule-value-spec
   })

(def v1beta1/ingress-rule-spec
  (ds/spec
    {:name ::v1beta1/ingress-rule
     :spec v1beta1/ingress-rule-data}))
