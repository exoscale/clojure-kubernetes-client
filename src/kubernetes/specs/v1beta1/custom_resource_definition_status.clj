(ns kubernetes.specs.v1beta1/custom-resource-definition-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/custom-resource-definition-names :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-condition :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-definition-status-data
  {
   (ds/req :acceptedNames) v1beta1/custom-resource-definition-names-spec
   (ds/req :conditions) (s/coll-of v1beta1/custom-resource-definition-condition-spec)
   })

(def v1beta1/custom-resource-definition-status-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-definition-status
     :spec v1beta1/custom-resource-definition-status-data}))
