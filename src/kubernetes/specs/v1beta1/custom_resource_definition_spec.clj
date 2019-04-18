(ns kubernetes.specs.v1beta1/custom-resource-definition-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/custom-resource-definition-names :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-validation :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-definition-spec-data
  {
   (ds/req :group) string?
   (ds/req :names) v1beta1/custom-resource-definition-names-spec
   (ds/req :scope) string?
   (ds/opt :validation) v1beta1/custom-resource-validation-spec
   (ds/req :version) string?
   })

(def v1beta1/custom-resource-definition-spec-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-definition-spec
     :spec v1beta1/custom-resource-definition-spec-data}))
