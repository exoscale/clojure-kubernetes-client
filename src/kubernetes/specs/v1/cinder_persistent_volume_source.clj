(ns kubernetes.specs.v1/cinder-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/secret-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/cinder-persistent-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1/secret-reference-spec
   (ds/req :volumeID) string?
   })

(def v1/cinder-persistent-volume-source-spec
  (ds/spec
    {:name ::v1/cinder-persistent-volume-source
     :spec v1/cinder-persistent-volume-source-data}))
