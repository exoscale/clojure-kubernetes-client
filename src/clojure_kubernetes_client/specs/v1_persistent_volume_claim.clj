(ns clojure-kubernetes-client.specs.v1-persistent-volume-claim
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-claim-data v1-persistent-volume-claim)
(def v1-persistent-volume-claim-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-persistent-volume-claim-spec
   (ds/opt :status) v1-persistent-volume-claim-status
   })

(def v1-persistent-volume-claim
  (ds/spec
    {:name ::v1-persistent-volume-claim
     :spec v1-persistent-volume-claim-data}))

