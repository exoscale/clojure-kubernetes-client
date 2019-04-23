(ns kubernetes.specs.v1beta1/csi-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/csi-driver-spec :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/csi-driver-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1beta1/csi-driver-spec-spec
   })

(def v1beta1/csi-driver-spec
  (ds/spec
    {:name ::v1beta1/csi-driver
     :spec v1beta1/csi-driver-data}))
