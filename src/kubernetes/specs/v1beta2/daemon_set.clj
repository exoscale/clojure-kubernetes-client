(ns kubernetes.specs.v1beta2/daemon-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-spec :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/daemon-set-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1beta2/daemon-set-spec-spec
   (ds/opt :status) v1beta2/daemon-set-status-spec
   })

(def v1beta2/daemon-set-spec
  (ds/spec
    {:name ::v1beta2/daemon-set
     :spec v1beta2/daemon-set-data}))
