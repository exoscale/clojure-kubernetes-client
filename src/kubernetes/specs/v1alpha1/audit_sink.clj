(ns kubernetes.specs.v1alpha1/audit-sink
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1alpha1/audit-sink-spec :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/audit-sink-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1alpha1/audit-sink-spec-spec
   })

(def v1alpha1/audit-sink-spec
  (ds/spec
    {:name ::v1alpha1/audit-sink
     :spec v1alpha1/audit-sink-data}))
