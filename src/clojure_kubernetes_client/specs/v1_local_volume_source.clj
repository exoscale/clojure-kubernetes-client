(ns clojure-kubernetes-client.specs.v1-local-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-local-volume-source-data v1-local-volume-source)
(def v1-local-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :path) string?
   })

(def v1-local-volume-source
  (ds/spec
    {:name ::v1-local-volume-source
     :spec v1-local-volume-source-data}))

