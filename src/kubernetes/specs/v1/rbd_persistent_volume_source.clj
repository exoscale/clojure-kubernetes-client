(ns kubernetes.specs.v1/rbd-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/secret-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/rbd-persistent-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :image) string?
   (ds/opt :keyring) string?
   (ds/req :monitors) (s/coll-of string?)
   (ds/opt :pool) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1/secret-reference-spec
   (ds/opt :user) string?
   })

(def v1/rbd-persistent-volume-source-spec
  (ds/spec
    {:name ::v1/rbd-persistent-volume-source
     :spec v1/rbd-persistent-volume-source-data}))
