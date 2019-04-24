(ns clojure-kubernetes-client.specs.v1-flex-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-flex-persistent-volume-source-data v1-flex-persistent-volume-source)
(def v1-flex-persistent-volume-source-data
  {
   (ds/req :driver) string?
   (ds/opt :fsType) string?
   (ds/opt :options) (s/map-of string? string?)
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-secret-reference
   })

(def v1-flex-persistent-volume-source
  (ds/spec
    {:name ::v1-flex-persistent-volume-source
     :spec v1-flex-persistent-volume-source-data}))

