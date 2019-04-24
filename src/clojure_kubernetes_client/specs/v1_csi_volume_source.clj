(ns clojure-kubernetes-client.specs.v1-csi-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-csi-volume-source-data v1-csi-volume-source)
(def v1-csi-volume-source-data
  {
   (ds/req :driver) string?
   (ds/opt :fsType) string?
   (ds/opt :nodePublishSecretRef) v1-local-object-reference
   (ds/opt :readOnly) boolean?
   (ds/opt :volumeAttributes) (s/map-of string? string?)
   })

(def v1-csi-volume-source
  (ds/spec
    {:name ::v1-csi-volume-source
     :spec v1-csi-volume-source-data}))

