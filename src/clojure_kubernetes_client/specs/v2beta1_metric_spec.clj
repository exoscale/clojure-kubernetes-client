(ns clojure-kubernetes-client.specs.v2beta1-metric-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta1-external-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-object-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-pods-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-resource-metric-source :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-metric-spec-data v2beta1-metric-spec)
(def v2beta1-metric-spec-data
  {
   (ds/opt :external) v2beta1-external-metric-source
   (ds/opt :object) v2beta1-object-metric-source
   (ds/opt :pods) v2beta1-pods-metric-source
   (ds/opt :resource) v2beta1-resource-metric-source
   (ds/req :type) string?
   })

(def v2beta1-metric-spec
  (ds/spec
    {:name ::v2beta1-metric-spec
     :spec v2beta1-metric-spec-data}))

