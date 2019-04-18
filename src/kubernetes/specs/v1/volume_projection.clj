(ns kubernetes.specs.v1/volume-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/config-map-projection :refer :all]
            [kubernetes.specs.v1/downward-api-projection :refer :all]
            [kubernetes.specs.v1/secret-projection :refer :all]
            )
  (:import (java.io File)))


(def v1/volume-projection-data
  {
   (ds/opt :configMap) v1/config-map-projection-spec
   (ds/opt :downwardAPI) v1/downward-api-projection-spec
   (ds/opt :secret) v1/secret-projection-spec
   })

(def v1/volume-projection-spec
  (ds/spec
    {:name ::v1/volume-projection
     :spec v1/volume-projection-data}))
