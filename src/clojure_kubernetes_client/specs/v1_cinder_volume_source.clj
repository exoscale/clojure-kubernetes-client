(ns clojure-kubernetes-client.specs.v1-cinder-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-cinder-volume-source-data v1-cinder-volume-source)
(def v1-cinder-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-local-object-reference
   (ds/req :volumeID) string?
   })

(def v1-cinder-volume-source
  (ds/spec
    {:name ::v1-cinder-volume-source
     :spec v1-cinder-volume-source-data}))

