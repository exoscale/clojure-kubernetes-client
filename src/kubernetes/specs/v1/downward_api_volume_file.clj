(ns kubernetes.specs.v1/downward-api-volume-file
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-field-selector :refer :all]
            [kubernetes.specs.v1/resource-field-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/downward-api-volume-file-data
  {
   (ds/opt :fieldRef) v1/object-field-selector-spec
   (ds/opt :mode) int?
   (ds/req :path) string?
   (ds/opt :resourceFieldRef) v1/resource-field-selector-spec
   })

(def v1/downward-api-volume-file-spec
  (ds/spec
    {:name ::v1/downward-api-volume-file
     :spec v1/downward-api-volume-file-data}))
