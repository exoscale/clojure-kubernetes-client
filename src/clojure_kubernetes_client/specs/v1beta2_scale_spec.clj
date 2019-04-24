(ns clojure-kubernetes-client.specs.v1beta2-scale-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta2-scale-spec-data v1beta2-scale-spec)
(def v1beta2-scale-spec-data
  {
   (ds/opt :replicas) int?
   })

(def v1beta2-scale-spec
  (ds/spec
    {:name ::v1beta2-scale-spec
     :spec v1beta2-scale-spec-data}))

