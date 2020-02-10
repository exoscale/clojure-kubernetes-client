(ns clojure-kubernetes-client.specs.v1alpha1-flow-schema-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-flow-schema-status-data v1alpha1-flow-schema-status)
(def v1alpha1-flow-schema-status-data
  {
   (ds/opt :conditions) (s/coll-of v1alpha1-flow-schema-condition)
   })

(def v1alpha1-flow-schema-status
  (ds/spec
    {:name ::v1alpha1-flow-schema-status
     :spec v1alpha1-flow-schema-status-data}))

