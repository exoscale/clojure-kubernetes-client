(ns clojure-kubernetes-client.specs.v1-custom-resource-subresources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-custom-resource-subresource-scale :refer :all]
            
            )
  (:import (java.io File)))


(declare v1-custom-resource-subresources-data v1-custom-resource-subresources)
(def v1-custom-resource-subresources-data
  {
   (ds/opt :scale) v1-custom-resource-subresource-scale
   (ds/opt :status) any?
   })

(def v1-custom-resource-subresources
  (ds/spec
    {:name ::v1-custom-resource-subresources
     :spec v1-custom-resource-subresources-data}))

