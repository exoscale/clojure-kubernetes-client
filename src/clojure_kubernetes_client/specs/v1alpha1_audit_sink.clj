(ns clojure-kubernetes-client.specs.v1alpha1-audit-sink
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-audit-sink-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-audit-sink-data v1alpha1-audit-sink)
(def v1alpha1-audit-sink-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1alpha1-audit-sink-spec
   })

(def v1alpha1-audit-sink
  (ds/spec
    {:name ::v1alpha1-audit-sink
     :spec v1alpha1-audit-sink-data}))

