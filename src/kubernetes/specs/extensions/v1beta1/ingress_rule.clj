(ns kubernetes.specs.extensions/v1beta1/ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/http-ingress-rule-value :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/ingress-rule-data
  {
   (ds/opt :host) string?
   (ds/opt :http) extensions/v1beta1/http-ingress-rule-value-spec
   })

(def extensions/v1beta1/ingress-rule-spec
  (ds/spec
    {:name ::extensions/v1beta1/ingress-rule
     :spec extensions/v1beta1/ingress-rule-data}))
