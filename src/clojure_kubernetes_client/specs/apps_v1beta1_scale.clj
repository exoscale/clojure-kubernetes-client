(ns clojure-kubernetes-client.specs.apps-v1beta1-scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-scale-status :refer :all]
            )
  (:import (java.io File)))


(declare apps-v1beta1-scale-data apps-v1beta1-scale)
(def apps-v1beta1-scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) apps-v1beta1-scale-spec
   (ds/opt :status) apps-v1beta1-scale-status
   })

(def apps-v1beta1-scale
  (ds/spec
    {:name ::apps-v1beta1-scale
     :spec apps-v1beta1-scale-data}))

