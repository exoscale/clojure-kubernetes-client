(ns clojure-kubernetes-client.specs.v1-volume-attachment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-volume-error :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-error :refer :all]
            )
  (:import (java.io File)))


(declare v1-volume-attachment-status-data v1-volume-attachment-status)
(def v1-volume-attachment-status-data
  {
   (ds/opt :attachError) v1-volume-error
   (ds/req :attached) boolean?
   (ds/opt :attachmentMetadata) (s/map-of string? string?)
   (ds/opt :detachError) v1-volume-error
   })

(def v1-volume-attachment-status
  (ds/spec
    {:name ::v1-volume-attachment-status
     :spec v1-volume-attachment-status-data}))

