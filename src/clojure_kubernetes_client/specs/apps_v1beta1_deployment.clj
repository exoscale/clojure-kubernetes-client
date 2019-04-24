(ns clojure-kubernetes-client.specs.apps-v1beta1-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-status :refer :all]
            )
  (:import (java.io File)))


(declare apps-v1beta1-deployment-data apps-v1beta1-deployment)
(def apps-v1beta1-deployment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) apps-v1beta1-deployment-spec
   (ds/opt :status) apps-v1beta1-deployment-status
   })

(def apps-v1beta1-deployment
  (ds/spec
    {:name ::apps-v1beta1-deployment
     :spec apps-v1beta1-deployment-data}))

