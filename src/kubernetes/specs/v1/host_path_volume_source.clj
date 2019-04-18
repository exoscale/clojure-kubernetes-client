(ns kubernetes.specs.v1/host-path-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/host-path-volume-source-data
  {
   (ds/req :path) string?
   (ds/opt :type) string?
   })

(def v1/host-path-volume-source-spec
  (ds/spec
    {:name ::v1/host-path-volume-source
     :spec v1/host-path-volume-source-data}))
