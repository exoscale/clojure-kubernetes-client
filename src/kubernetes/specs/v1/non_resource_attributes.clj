(ns kubernetes.specs.v1/non-resource-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/non-resource-attributes-data
  {
   (ds/opt :path) string?
   (ds/opt :verb) string?
   })

(def v1/non-resource-attributes-spec
  (ds/spec
    {:name ::v1/non-resource-attributes
     :spec v1/non-resource-attributes-data}))
