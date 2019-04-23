(ns kubernetes.specs.v1beta1/custom-resource-definition-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/custom-resource-column-definition :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-validation :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-subresources :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-definition-version-data
  {
   (ds/opt :additionalPrinterColumns) (s/coll-of v1beta1/custom-resource-column-definition-spec)
   (ds/req :name) string?
   (ds/opt :schema) v1beta1/custom-resource-validation-spec
   (ds/req :served) boolean?
   (ds/req :storage) boolean?
   (ds/opt :subresources) v1beta1/custom-resource-subresources-spec
   })

(def v1beta1/custom-resource-definition-version-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-definition-version
     :spec v1beta1/custom-resource-definition-version-data}))
