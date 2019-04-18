(ns kubernetes.specs.v1beta1/service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/service-reference-data
  {
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   })

(def v1beta1/service-reference-spec
  (ds/spec
    {:name ::v1beta1/service-reference
     :spec v1beta1/service-reference-data}))
