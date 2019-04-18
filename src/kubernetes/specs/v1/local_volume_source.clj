(ns kubernetes.specs.v1/local-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/local-volume-source-data
  {
   (ds/req :path) string?
   })

(def v1/local-volume-source-spec
  (ds/spec
    {:name ::v1/local-volume-source
     :spec v1/local-volume-source-data}))
