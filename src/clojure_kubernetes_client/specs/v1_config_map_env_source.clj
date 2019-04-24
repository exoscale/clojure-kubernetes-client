(ns clojure-kubernetes-client.specs.v1-config-map-env-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-config-map-env-source-data v1-config-map-env-source)
(def v1-config-map-env-source-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1-config-map-env-source
  (ds/spec
    {:name ::v1-config-map-env-source
     :spec v1-config-map-env-source-data}))

