(ns kubernetes.specs.v1/volume-attachment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/volume-attachment-spec :refer :all]
            [kubernetes.specs.v1/volume-attachment-status :refer :all]
            )
  (:import (java.io File)))


(def v1/volume-attachment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1/volume-attachment-spec-spec
   (ds/opt :status) v1/volume-attachment-status-spec
   })

(def v1/volume-attachment-spec
  (ds/spec
    {:name ::v1/volume-attachment
     :spec v1/volume-attachment-data}))
