(ns kubernetes.specs.v1/volume-node-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/volume-node-affinity-data
  {
   (ds/opt :required) v1/node-selector-spec
   })

(def v1/volume-node-affinity-spec
  (ds/spec
    {:name ::v1/volume-node-affinity
     :spec v1/volume-node-affinity-data}))
