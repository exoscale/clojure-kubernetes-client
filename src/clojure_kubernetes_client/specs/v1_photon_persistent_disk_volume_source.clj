(ns clojure-kubernetes-client.specs.v1-photon-persistent-disk-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-photon-persistent-disk-volume-source-data v1-photon-persistent-disk-volume-source)
(def v1-photon-persistent-disk-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :pdID) string?
   })

(def v1-photon-persistent-disk-volume-source
  (ds/spec
    {:name ::v1-photon-persistent-disk-volume-source
     :spec v1-photon-persistent-disk-volume-source-data}))

