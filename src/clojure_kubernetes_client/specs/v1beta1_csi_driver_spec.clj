(ns clojure-kubernetes-client.specs.v1beta1-csi-driver-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-csi-driver-spec-data v1beta1-csi-driver-spec)
(def v1beta1-csi-driver-spec-data
  {
   (ds/opt :attachRequired) boolean?
   (ds/opt :podInfoOnMount) boolean?
   (ds/opt :volumeLifecycleModes) (s/coll-of string?)
   })

(def v1beta1-csi-driver-spec
  (ds/spec
    {:name ::v1beta1-csi-driver-spec
     :spec v1beta1-csi-driver-spec-data}))

