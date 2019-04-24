(ns clojure-kubernetes-client.specs.v1-component-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-component-condition-data v1-component-condition)
(def v1-component-condition-data
  {
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-component-condition
  (ds/spec
    {:name ::v1-component-condition
     :spec v1-component-condition-data}))

