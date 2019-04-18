(ns kubernetes.specs.v1/config-map-env-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/config-map-env-source-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1/config-map-env-source-spec
  (ds/spec
    {:name ::v1/config-map-env-source
     :spec v1/config-map-env-source-data}))
