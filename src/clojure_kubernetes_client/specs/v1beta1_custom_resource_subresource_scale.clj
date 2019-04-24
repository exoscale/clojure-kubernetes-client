(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-subresource-scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-subresource-scale-data v1beta1-custom-resource-subresource-scale)
(def v1beta1-custom-resource-subresource-scale-data
  {
   (ds/opt :labelSelectorPath) string?
   (ds/req :specReplicasPath) string?
   (ds/req :statusReplicasPath) string?
   })

(def v1beta1-custom-resource-subresource-scale
  (ds/spec
    {:name ::v1beta1-custom-resource-subresource-scale
     :spec v1beta1-custom-resource-subresource-scale-data}))

