(ns clojure-kubernetes-client.specs.v1-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-subject-data v1-subject)
(def v1-subject-data
  {
   (ds/opt :apiGroup) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/opt :namespace) string?
   })

(def v1-subject
  (ds/spec
    {:name ::v1-subject
     :spec v1-subject-data}))

