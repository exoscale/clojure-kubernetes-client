(ns kubernetes.specs.v1/node-config-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/config-map-node-config-source :refer :all]
            )
  (:import (java.io File)))


(def v1/node-config-source-data
  {
   (ds/opt :configMap) v1/config-map-node-config-source-spec
   })

(def v1/node-config-source-spec
  (ds/spec
    {:name ::v1/node-config-source
     :spec v1/node-config-source-data}))
