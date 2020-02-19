(ns clojure-kubernetes-client.specs.v1-csi-node-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-csi-node-driver :refer :all]
            )
  (:import (java.io File)))


(declare v1-csi-node-spec-data v1-csi-node-spec)
(def v1-csi-node-spec-data
  {
   (ds/req :drivers) (s/coll-of v1-csi-node-driver)
   })

(def v1-csi-node-spec
  (ds/spec
    {:name ::v1-csi-node-spec
     :spec v1-csi-node-spec-data}))

