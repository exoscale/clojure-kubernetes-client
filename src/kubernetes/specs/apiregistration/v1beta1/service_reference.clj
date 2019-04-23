(ns kubernetes.specs.apiregistration/v1beta1/service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def apiregistration/v1beta1/service-reference-data
  {
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   })

(def apiregistration/v1beta1/service-reference-spec
  (ds/spec
    {:name ::apiregistration/v1beta1/service-reference
     :spec apiregistration/v1beta1/service-reference-data}))
