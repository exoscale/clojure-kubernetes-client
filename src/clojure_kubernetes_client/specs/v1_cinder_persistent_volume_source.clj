(ns clojure-kubernetes-client.specs.v1-cinder-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-cinder-persistent-volume-source-data v1-cinder-persistent-volume-source)
(def v1-cinder-persistent-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-secret-reference
   (ds/req :volumeID) string?
   })

(def v1-cinder-persistent-volume-source
  (ds/spec
    {:name ::v1-cinder-persistent-volume-source
     :spec v1-cinder-persistent-volume-source-data}))

