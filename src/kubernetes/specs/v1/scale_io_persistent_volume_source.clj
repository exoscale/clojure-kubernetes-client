(ns kubernetes.specs.v1/scale-io-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/secret-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/scale-io-persistent-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :gateway) string?
   (ds/opt :protectionDomain) string?
   (ds/opt :readOnly) boolean?
   (ds/req :secretRef) v1/secret-reference-spec
   (ds/opt :sslEnabled) boolean?
   (ds/opt :storageMode) string?
   (ds/opt :storagePool) string?
   (ds/req :system) string?
   (ds/opt :volumeName) string?
   })

(def v1/scale-io-persistent-volume-source-spec
  (ds/spec
    {:name ::v1/scale-io-persistent-volume-source
     :spec v1/scale-io-persistent-volume-source-data}))
