(ns clojure-kubernetes-client.specs.v1-env-var-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-config-map-key-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-object-field-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-field-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-key-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-env-var-source-data v1-env-var-source)
(def v1-env-var-source-data
  {
   (ds/opt :configMapKeyRef) v1-config-map-key-selector
   (ds/opt :fieldRef) v1-object-field-selector
   (ds/opt :resourceFieldRef) v1-resource-field-selector
   (ds/opt :secretKeyRef) v1-secret-key-selector
   })

(def v1-env-var-source
  (ds/spec
    {:name ::v1-env-var-source
     :spec v1-env-var-source-data}))

