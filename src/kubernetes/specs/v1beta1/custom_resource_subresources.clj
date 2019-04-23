(ns kubernetes.specs.v1beta1/custom-resource-subresources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/custom-resource-subresource-scale :refer :all]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-subresources-data
  {
   (ds/opt :scale) v1beta1/custom-resource-subresource-scale-spec
   (ds/opt :status) any?
   })

(def v1beta1/custom-resource-subresources-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-subresources
     :spec v1beta1/custom-resource-subresources-data}))
