(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-subresources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-subresource-scale :refer :all]
            
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-subresources-data v1beta1-custom-resource-subresources)
(def v1beta1-custom-resource-subresources-data
  {
   (ds/opt :scale) v1beta1-custom-resource-subresource-scale
   (ds/opt :status) any?
   })

(def v1beta1-custom-resource-subresources
  (ds/spec
    {:name ::v1beta1-custom-resource-subresources
     :spec v1beta1-custom-resource-subresources-data}))

