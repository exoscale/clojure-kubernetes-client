(ns clojure-kubernetes-client.specs.v1-custom-resource-definition-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-condition-data v1-custom-resource-definition-condition)
(def v1-custom-resource-definition-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-custom-resource-definition-condition
  (ds/spec
    {:name ::v1-custom-resource-definition-condition
     :spec v1-custom-resource-definition-condition-data}))

