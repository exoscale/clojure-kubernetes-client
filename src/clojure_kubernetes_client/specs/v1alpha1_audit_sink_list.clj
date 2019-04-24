(ns clojure-kubernetes-client.specs.v1alpha1-audit-sink-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-audit-sink :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-audit-sink-list-data v1alpha1-audit-sink-list)
(def v1alpha1-audit-sink-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1alpha1-audit-sink)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1alpha1-audit-sink-list
  (ds/spec
    {:name ::v1alpha1-audit-sink-list
     :spec v1alpha1-audit-sink-list-data}))

