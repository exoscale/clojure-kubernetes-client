(ns kubernetes.specs.v1/pod
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/pod-spec :refer :all]
            [kubernetes.specs.v1/pod-status :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/pod-spec-spec
   (ds/opt :status) v1/pod-status-spec
   })

(def v1/pod-spec
  (ds/spec
    {:name ::v1/pod
     :spec v1/pod-data}))
