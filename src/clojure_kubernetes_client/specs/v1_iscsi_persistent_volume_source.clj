(ns clojure-kubernetes-client.specs.v1-iscsi-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-iscsi-persistent-volume-source-data v1-iscsi-persistent-volume-source)
(def v1-iscsi-persistent-volume-source-data
  {
   (ds/opt :chapAuthDiscovery) boolean?
   (ds/opt :chapAuthSession) boolean?
   (ds/opt :fsType) string?
   (ds/opt :initiatorName) string?
   (ds/req :iqn) string?
   (ds/opt :iscsiInterface) string?
   (ds/req :lun) int?
   (ds/opt :portals) (s/coll-of string?)
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-secret-reference
   (ds/req :targetPortal) string?
   })

(def v1-iscsi-persistent-volume-source
  (ds/spec
    {:name ::v1-iscsi-persistent-volume-source
     :spec v1-iscsi-persistent-volume-source-data}))

