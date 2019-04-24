(ns clojure-kubernetes-client.specs.extensions-v1beta1-scale-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-scale-spec-data extensions-v1beta1-scale-spec)
(def extensions-v1beta1-scale-spec-data
  {
   (ds/opt :replicas) int?
   })

(def extensions-v1beta1-scale-spec
  (ds/spec
    {:name ::extensions-v1beta1-scale-spec
     :spec extensions-v1beta1-scale-spec-data}))

