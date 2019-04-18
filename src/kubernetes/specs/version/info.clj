(ns kubernetes.specs.version/info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version/info-data
  {
   (ds/req :buildDate) string?
   (ds/req :compiler) string?
   (ds/req :gitCommit) string?
   (ds/req :gitTreeState) string?
   (ds/req :gitVersion) string?
   (ds/req :goVersion) string?
   (ds/req :major) string?
   (ds/req :minor) string?
   (ds/req :platform) string?
   })

(def version/info-spec
  (ds/spec
    {:name ::version/info
     :spec version/info-data}))
