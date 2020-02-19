(ns clojure-kubernetes-client.specs.v1alpha1-flow-schema-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-flow-schema-list-data v1alpha1-flow-schema-list)
(def v1alpha1-flow-schema-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1alpha1-flow-schema)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1alpha1-flow-schema-list
  (ds/spec
    {:name ::v1alpha1-flow-schema-list
     :spec v1alpha1-flow-schema-list-data}))

