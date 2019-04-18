(ns kubernetes.specs.v1beta2/controller-revision
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.runtime/raw-extension :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/controller-revision-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :data) runtime/raw-extension-spec
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :revision) int?
   })

(def v1beta2/controller-revision-spec
  (ds/spec
    {:name ::v1beta2/controller-revision
     :spec v1beta2/controller-revision-data}))
