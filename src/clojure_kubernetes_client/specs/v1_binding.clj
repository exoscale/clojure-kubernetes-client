(ns clojure-kubernetes-client.specs.v1-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-binding-data v1-binding)
(def v1-binding-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :target) v1-object-reference
   })

(def v1-binding
  (ds/spec
    {:name ::v1-binding
     :spec v1-binding-data}))

