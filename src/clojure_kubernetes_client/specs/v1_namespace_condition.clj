(ns clojure-kubernetes-client.specs.v1-namespace-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-namespace-condition-data v1-namespace-condition)
(def v1-namespace-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-namespace-condition
  (ds/spec
    {:name ::v1-namespace-condition
     :spec v1-namespace-condition-data}))

