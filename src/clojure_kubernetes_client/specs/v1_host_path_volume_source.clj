(ns clojure-kubernetes-client.specs.v1-host-path-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-host-path-volume-source-data v1-host-path-volume-source)
(def v1-host-path-volume-source-data
  {
   (ds/req :path) string?
   (ds/opt :type) string?
   })

(def v1-host-path-volume-source
  (ds/spec
    {:name ::v1-host-path-volume-source
     :spec v1-host-path-volume-source-data}))

