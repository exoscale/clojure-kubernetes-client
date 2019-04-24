(ns clojure-kubernetes-client.specs.v1-node-config-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-config-source :refer :all]
            [clojure-kubernetes-client.specs.v1-node-config-source :refer :all]
            [clojure-kubernetes-client.specs.v1-node-config-source :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-config-status-data v1-node-config-status)
(def v1-node-config-status-data
  {
   (ds/opt :active) v1-node-config-source
   (ds/opt :assigned) v1-node-config-source
   (ds/opt :error) string?
   (ds/opt :lastKnownGood) v1-node-config-source
   })

(def v1-node-config-status
  (ds/spec
    {:name ::v1-node-config-status
     :spec v1-node-config-status-data}))

