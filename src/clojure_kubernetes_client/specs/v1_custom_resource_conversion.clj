(ns clojure-kubernetes-client.specs.v1-custom-resource-conversion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-webhook-conversion :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-conversion-data v1-custom-resource-conversion)
(def v1-custom-resource-conversion-data
  {
   (ds/req :strategy) string?
   (ds/opt :webhook) v1-webhook-conversion
   })

(def v1-custom-resource-conversion
  (ds/spec
    {:name ::v1-custom-resource-conversion
     :spec v1-custom-resource-conversion-data}))

