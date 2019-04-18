(ns kubernetes.specs.v1/group-version-for-discovery
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/group-version-for-discovery-data
  {
   (ds/req :groupVersion) string?
   (ds/req :version) string?
   })

(def v1/group-version-for-discovery-spec
  (ds/spec
    {:name ::v1/group-version-for-discovery
     :spec v1/group-version-for-discovery-data}))
