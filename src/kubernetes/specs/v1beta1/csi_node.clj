(ns kubernetes.specs.v1beta1/csi-node
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/csi-node-spec :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/csi-node-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1beta1/csi-node-spec-spec
   })

(def v1beta1/csi-node-spec
  (ds/spec
    {:name ::v1beta1/csi-node
     :spec v1beta1/csi-node-data}))
