(ns clojure-kubernetes-client.specs.v1-volume-mount
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-volume-mount-data v1-volume-mount)
(def v1-volume-mount-data
  {
   (ds/req :mountPath) string?
   (ds/opt :mountPropagation) string?
   (ds/req :name) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :subPath) string?
   (ds/opt :subPathExpr) string?
   })

(def v1-volume-mount
  (ds/spec
    {:name ::v1-volume-mount
     :spec v1-volume-mount-data}))

