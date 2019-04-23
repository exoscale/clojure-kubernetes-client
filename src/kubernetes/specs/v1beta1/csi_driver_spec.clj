(ns kubernetes.specs.v1beta1/csi-driver-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/csi-driver-spec-data
  {
   (ds/opt :attachRequired) boolean?
   (ds/opt :podInfoOnMount) boolean?
   })

(def v1beta1/csi-driver-spec-spec
  (ds/spec
    {:name ::v1beta1/csi-driver-spec
     :spec v1beta1/csi-driver-spec-data}))
