(ns clojure-kubernetes-client.specs.v1-daemon-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-daemon-set-data v1-daemon-set)
(def v1-daemon-set-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-daemon-set-spec
   (ds/opt :status) v1-daemon-set-status
   })

(def v1-daemon-set
  (ds/spec
    {:name ::v1-daemon-set
     :spec v1-daemon-set-data}))

