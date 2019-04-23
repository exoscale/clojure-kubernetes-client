(ns kubernetes.specs.v1/csi-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/secret-reference :refer :all]
            [kubernetes.specs.v1/secret-reference :refer :all]
            [kubernetes.specs.v1/secret-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/csi-persistent-volume-source-data
  {
   (ds/opt :controllerPublishSecretRef) v1/secret-reference-spec
   (ds/req :driver) string?
   (ds/opt :fsType) string?
   (ds/opt :nodePublishSecretRef) v1/secret-reference-spec
   (ds/opt :nodeStageSecretRef) v1/secret-reference-spec
   (ds/opt :readOnly) boolean?
   (ds/opt :volumeAttributes) (s/map-of string? string?)
   (ds/req :volumeHandle) string?
   })

(def v1/csi-persistent-volume-source-spec
  (ds/spec
    {:name ::v1/csi-persistent-volume-source
     :spec v1/csi-persistent-volume-source-data}))
