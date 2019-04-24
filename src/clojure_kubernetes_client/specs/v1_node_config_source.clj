(ns clojure-kubernetes-client.specs.v1-node-config-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-config-map-node-config-source :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-config-source-data v1-node-config-source)
(def v1-node-config-source-data
  {
   (ds/opt :configMap) v1-config-map-node-config-source
   })

(def v1-node-config-source
  (ds/spec
    {:name ::v1-node-config-source
     :spec v1-node-config-source-data}))

