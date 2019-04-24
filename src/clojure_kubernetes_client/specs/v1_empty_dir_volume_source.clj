(ns clojure-kubernetes-client.specs.v1-empty-dir-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-empty-dir-volume-source-data v1-empty-dir-volume-source)
(def v1-empty-dir-volume-source-data
  {
   (ds/opt :medium) string?
   (ds/opt :sizeLimit) string?
   })

(def v1-empty-dir-volume-source
  (ds/spec
    {:name ::v1-empty-dir-volume-source
     :spec v1-empty-dir-volume-source-data}))

