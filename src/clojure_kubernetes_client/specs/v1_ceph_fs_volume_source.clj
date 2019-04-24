(ns clojure-kubernetes-client.specs.v1-ceph-fs-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-ceph-fs-volume-source-data v1-ceph-fs-volume-source)
(def v1-ceph-fs-volume-source-data
  {
   (ds/req :monitors) (s/coll-of string?)
   (ds/opt :path) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretFile) string?
   (ds/opt :secretRef) v1-local-object-reference
   (ds/opt :user) string?
   })

(def v1-ceph-fs-volume-source
  (ds/spec
    {:name ::v1-ceph-fs-volume-source
     :spec v1-ceph-fs-volume-source-data}))

