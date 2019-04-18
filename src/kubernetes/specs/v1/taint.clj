(ns kubernetes.specs.v1/taint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/taint-data
  {
   (ds/req :effect) string?
   (ds/req :key) string?
   (ds/opt :timeAdded) inst?
   (ds/opt :value) string?
   })

(def v1/taint-spec
  (ds/spec
    {:name ::v1/taint
     :spec v1/taint-data}))
