(ns clojure-kubernetes-client.specs.extensions-v1beta1-runtime-class-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-runtime-class-strategy-options-data extensions-v1beta1-runtime-class-strategy-options)
(def extensions-v1beta1-runtime-class-strategy-options-data
  {
   (ds/req :allowedRuntimeClassNames) (s/coll-of string?)
   (ds/opt :defaultRuntimeClassName) string?
   })

(def extensions-v1beta1-runtime-class-strategy-options
  (ds/spec
    {:name ::extensions-v1beta1-runtime-class-strategy-options
     :spec extensions-v1beta1-runtime-class-strategy-options-data}))

