(ns kubernetes.specs.v1/persistent-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/persistent-volume-spec :refer :all]
            [kubernetes.specs.v1/persistent-volume-status :refer :all]
            )
  (:import (java.io File)))


(def v1/persistent-volume-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/persistent-volume-spec-spec
   (ds/opt :status) v1/persistent-volume-status-spec
   })

(def v1/persistent-volume-spec
  (ds/spec
    {:name ::v1/persistent-volume
     :spec v1/persistent-volume-data}))
