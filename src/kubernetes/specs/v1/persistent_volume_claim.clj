(ns kubernetes.specs.v1/persistent-volume-claim
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-spec :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-status :refer :all]
            )
  (:import (java.io File)))


(def v1/persistent-volume-claim-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/persistent-volume-claim-spec-spec
   (ds/opt :status) v1/persistent-volume-claim-status-spec
   })

(def v1/persistent-volume-claim-spec
  (ds/spec
    {:name ::v1/persistent-volume-claim
     :spec v1/persistent-volume-claim-data}))
