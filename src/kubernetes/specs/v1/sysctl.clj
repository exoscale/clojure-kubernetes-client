(ns kubernetes.specs.v1/sysctl
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/sysctl-data
  {
   (ds/req :name) string?
   (ds/req :value) string?
   })

(def v1/sysctl-spec
  (ds/spec
    {:name ::v1/sysctl
     :spec v1/sysctl-data}))
