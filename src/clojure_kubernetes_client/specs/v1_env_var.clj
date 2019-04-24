(ns clojure-kubernetes-client.specs.v1-env-var
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-env-var-source :refer :all]
            )
  (:import (java.io File)))


(declare v1-env-var-data v1-env-var)
(def v1-env-var-data
  {
   (ds/req :name) string?
   (ds/opt :value) string?
   (ds/opt :valueFrom) v1-env-var-source
   })

(def v1-env-var
  (ds/spec
    {:name ::v1-env-var
     :spec v1-env-var-data}))

