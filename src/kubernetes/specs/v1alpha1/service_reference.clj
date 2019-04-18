(ns kubernetes.specs.v1alpha1/service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1alpha1/service-reference-data
  {
   (ds/req :name) string?
   (ds/req :namespace) string?
   })

(def v1alpha1/service-reference-spec
  (ds/spec
    {:name ::v1alpha1/service-reference
     :spec v1alpha1/service-reference-data}))
