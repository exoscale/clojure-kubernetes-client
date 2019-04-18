(ns kubernetes.specs.v1/toleration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/toleration-data
  {
   (ds/opt :effect) string?
   (ds/opt :key) string?
   (ds/opt :operator) string?
   (ds/opt :tolerationSeconds) int?
   (ds/opt :value) string?
   })

(def v1/toleration-spec
  (ds/spec
    {:name ::v1/toleration
     :spec v1/toleration-data}))
