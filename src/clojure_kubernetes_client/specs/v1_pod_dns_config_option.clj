(ns clojure-kubernetes-client.specs.v1-pod-dns-config-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-pod-dns-config-option-data v1-pod-dns-config-option)
(def v1-pod-dns-config-option-data
  {
   (ds/opt :name) string?
   (ds/opt :value) string?
   })

(def v1-pod-dns-config-option
  (ds/spec
    {:name ::v1-pod-dns-config-option
     :spec v1-pod-dns-config-option-data}))

