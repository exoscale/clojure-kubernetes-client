(ns kubernetes.specs.v1/owner-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/owner-reference-data
  {
   (ds/req :apiVersion) string?
   (ds/opt :blockOwnerDeletion) boolean?
   (ds/opt :controller) boolean?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/req :uid) string?
   })

(def v1/owner-reference-spec
  (ds/spec
    {:name ::v1/owner-reference
     :spec v1/owner-reference-data}))
