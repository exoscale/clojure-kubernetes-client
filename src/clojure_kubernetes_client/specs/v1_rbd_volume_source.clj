(ns clojure-kubernetes-client.specs.v1-rbd-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-rbd-volume-source-data v1-rbd-volume-source)
(def v1-rbd-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :image) string?
   (ds/opt :keyring) string?
   (ds/req :monitors) (s/coll-of string?)
   (ds/opt :pool) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-local-object-reference
   (ds/opt :user) string?
   })

(def v1-rbd-volume-source
  (ds/spec
    {:name ::v1-rbd-volume-source
     :spec v1-rbd-volume-source-data}))

