(ns kubernetes.specs.v1/empty-dir-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/empty-dir-volume-source-data
  {
   (ds/opt :medium) string?
   (ds/opt :sizeLimit) string?
   })

(def v1/empty-dir-volume-source-spec
  (ds/spec
    {:name ::v1/empty-dir-volume-source
     :spec v1/empty-dir-volume-source-data}))
