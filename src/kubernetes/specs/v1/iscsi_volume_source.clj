(ns kubernetes.specs.v1/iscsi-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/iscsi-volume-source-data
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
   (ds/opt :secretRef) v1/local-object-reference-spec
   (ds/req :targetPortal) string?
   })

(def v1/iscsi-volume-source-spec
  (ds/spec
    {:name ::v1/iscsi-volume-source
     :spec v1/iscsi-volume-source-data}))
