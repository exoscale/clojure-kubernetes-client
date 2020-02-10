(ns clojure-kubernetes-client.specs.v1-custom-resource-subresource-scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-custom-resource-subresource-scale-data v1-custom-resource-subresource-scale)
(def v1-custom-resource-subresource-scale-data
  {
   (ds/opt :labelSelectorPath) string?
   (ds/req :specReplicasPath) string?
   (ds/req :statusReplicasPath) string?
   })

(def v1-custom-resource-subresource-scale
  (ds/spec
    {:name ::v1-custom-resource-subresource-scale
     :spec v1-custom-resource-subresource-scale-data}))

