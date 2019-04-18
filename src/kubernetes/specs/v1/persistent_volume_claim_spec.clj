(ns kubernetes.specs.v1/persistent-volume-claim-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/resource-requirements :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/persistent-volume-claim-spec-data
  {
   (ds/opt :accessModes) (s/coll-of string?)
   (ds/opt :resources) v1/resource-requirements-spec
   (ds/opt :selector) v1/label-selector-spec
   (ds/opt :storageClassName) string?
   (ds/opt :volumeName) string?
   })

(def v1/persistent-volume-claim-spec-spec
  (ds/spec
    {:name ::v1/persistent-volume-claim-spec
     :spec v1/persistent-volume-claim-spec-data}))
