(ns clojure-kubernetes-client.specs.v1-pod-dns-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-pod-dns-config-option :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-dns-config-data v1-pod-dns-config)
(def v1-pod-dns-config-data
  {
   (ds/opt :nameservers) (s/coll-of string?)
   (ds/opt :options) (s/coll-of v1-pod-dns-config-option)
   (ds/opt :searches) (s/coll-of string?)
   })

(def v1-pod-dns-config
  (ds/spec
    {:name ::v1-pod-dns-config
     :spec v1-pod-dns-config-data}))

