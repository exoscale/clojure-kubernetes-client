(ns kubernetes.specs.v1beta1/custom-resource-definition-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/custom-resource-column-definition :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-conversion :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-names :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-subresources :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-validation :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-version :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-definition-spec-data
  {
   (ds/opt :additionalPrinterColumns) (s/coll-of v1beta1/custom-resource-column-definition-spec)
   (ds/opt :conversion) v1beta1/custom-resource-conversion-spec
   (ds/req :group) string?
   (ds/req :names) v1beta1/custom-resource-definition-names-spec
   (ds/req :scope) string?
   (ds/opt :subresources) v1beta1/custom-resource-subresources-spec
   (ds/opt :validation) v1beta1/custom-resource-validation-spec
   (ds/opt :version) string?
   (ds/opt :versions) (s/coll-of v1beta1/custom-resource-definition-version-spec)
   })

(def v1beta1/custom-resource-definition-spec-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-definition-spec
     :spec v1beta1/custom-resource-definition-spec-data}))
