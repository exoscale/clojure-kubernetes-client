(ns clojure-kubernetes-client.specs.v1-http-header
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-http-header-data v1-http-header)
(def v1-http-header-data
  {
   (ds/req :name) string?
   (ds/req :value) string?
   })

(def v1-http-header
  (ds/spec
    {:name ::v1-http-header
     :spec v1-http-header-data}))

