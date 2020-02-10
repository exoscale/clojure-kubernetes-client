(ns clojure-kubernetes-client.specs.v1alpha1-flow-schema
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-spec :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-status :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-flow-schema-data v1alpha1-flow-schema)
(def v1alpha1-flow-schema-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1alpha1-flow-schema-spec
   (ds/opt :status) v1alpha1-flow-schema-status
   })

(def v1alpha1-flow-schema
  (ds/spec
    {:name ::v1alpha1-flow-schema
     :spec v1alpha1-flow-schema-data}))

