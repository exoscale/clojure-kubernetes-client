(ns kubernetes.specs.v1/flocker-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/flocker-volume-source-data
  {
   (ds/opt :datasetName) string?
   (ds/opt :datasetUUID) string?
   })

(def v1/flocker-volume-source-spec
  (ds/spec
    {:name ::v1/flocker-volume-source
     :spec v1/flocker-volume-source-data}))
