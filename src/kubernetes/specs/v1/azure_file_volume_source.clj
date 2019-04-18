(ns kubernetes.specs.v1/azure-file-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/azure-file-volume-source-data
  {
   (ds/opt :readOnly) boolean?
   (ds/req :secretName) string?
   (ds/req :shareName) string?
   })

(def v1/azure-file-volume-source-spec
  (ds/spec
    {:name ::v1/azure-file-volume-source
     :spec v1/azure-file-volume-source-data}))
