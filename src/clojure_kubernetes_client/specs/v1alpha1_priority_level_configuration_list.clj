(ns clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-priority-level-configuration-list-data v1alpha1-priority-level-configuration-list)
(def v1alpha1-priority-level-configuration-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1alpha1-priority-level-configuration)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1alpha1-priority-level-configuration-list
  (ds/spec
    {:name ::v1alpha1-priority-level-configuration-list
     :spec v1alpha1-priority-level-configuration-list-data}))

