(ns clojure-kubernetes-client.specs.v1-csi-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-csi-persistent-volume-source-data v1-csi-persistent-volume-source)
(def v1-csi-persistent-volume-source-data
  {
   (ds/opt :controllerExpandSecretRef) v1-secret-reference
   (ds/opt :controllerPublishSecretRef) v1-secret-reference
   (ds/req :driver) string?
   (ds/opt :fsType) string?
   (ds/opt :nodePublishSecretRef) v1-secret-reference
   (ds/opt :nodeStageSecretRef) v1-secret-reference
   (ds/opt :readOnly) boolean?
   (ds/opt :volumeAttributes) (s/map-of string? string?)
   (ds/req :volumeHandle) string?
   })

(def v1-csi-persistent-volume-source
  (ds/spec
    {:name ::v1-csi-persistent-volume-source
     :spec v1-csi-persistent-volume-source-data}))

