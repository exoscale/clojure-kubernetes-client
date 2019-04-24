(ns clojure-kubernetes-client.specs.v1-group-version-for-discovery
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-group-version-for-discovery-data v1-group-version-for-discovery)
(def v1-group-version-for-discovery-data
  {
   (ds/req :groupVersion) string?
   (ds/req :version) string?
   })

(def v1-group-version-for-discovery
  (ds/spec
    {:name ::v1-group-version-for-discovery
     :spec v1-group-version-for-discovery-data}))

