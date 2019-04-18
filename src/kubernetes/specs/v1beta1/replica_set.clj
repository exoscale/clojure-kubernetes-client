(ns kubernetes.specs.v1beta1/replica-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/replica-set-spec :refer :all]
            [kubernetes.specs.v1beta1/replica-set-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/replica-set-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1beta1/replica-set-spec-spec
   (ds/opt :status) v1beta1/replica-set-status-spec
   })

(def v1beta1/replica-set-spec
  (ds/spec
    {:name ::v1beta1/replica-set
     :spec v1beta1/replica-set-data}))
