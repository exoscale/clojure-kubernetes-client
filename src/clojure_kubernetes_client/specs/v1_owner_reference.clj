(ns clojure-kubernetes-client.specs.v1-owner-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-owner-reference-data v1-owner-reference)
(def v1-owner-reference-data
  {
   (ds/req :apiVersion) string?
   (ds/opt :blockOwnerDeletion) boolean?
   (ds/opt :controller) boolean?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/req :uid) string?
   })

(def v1-owner-reference
  (ds/spec
    {:name ::v1-owner-reference
     :spec v1-owner-reference-data}))

