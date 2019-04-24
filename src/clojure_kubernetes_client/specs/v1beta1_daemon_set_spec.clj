(ns clojure-kubernetes-client.specs.v1beta1-daemon-set-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-update-strategy :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-daemon-set-spec-data v1beta1-daemon-set-spec)
(def v1beta1-daemon-set-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/opt :selector) v1-label-selector
   (ds/req :template) v1-pod-template-spec
   (ds/opt :templateGeneration) int?
   (ds/opt :updateStrategy) v1beta1-daemon-set-update-strategy
   })

(def v1beta1-daemon-set-spec
  (ds/spec
    {:name ::v1beta1-daemon-set-spec
     :spec v1beta1-daemon-set-spec-data}))

