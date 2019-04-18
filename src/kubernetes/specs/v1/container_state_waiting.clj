(ns kubernetes.specs.v1/container-state-waiting
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/container-state-waiting-data
  {
   (ds/opt :message) string?
   (ds/opt :reason) string?
   })

(def v1/container-state-waiting-spec
  (ds/spec
    {:name ::v1/container-state-waiting
     :spec v1/container-state-waiting-data}))
