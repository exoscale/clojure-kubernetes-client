(ns clojure-kubernetes-client.specs.v1alpha1-flow-schema-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-flow-schema-condition-data v1alpha1-flow-schema-condition)
(def v1alpha1-flow-schema-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/opt :status) string?
   (ds/opt :type) string?
   })

(def v1alpha1-flow-schema-condition
  (ds/spec
    {:name ::v1alpha1-flow-schema-condition
     :spec v1alpha1-flow-schema-condition-data}))

