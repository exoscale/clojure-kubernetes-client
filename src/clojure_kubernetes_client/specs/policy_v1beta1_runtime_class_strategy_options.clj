(ns clojure-kubernetes-client.specs.policy-v1beta1-runtime-class-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare policy-v1beta1-runtime-class-strategy-options-data policy-v1beta1-runtime-class-strategy-options)
(def policy-v1beta1-runtime-class-strategy-options-data
  {
   (ds/req :allowedRuntimeClassNames) (s/coll-of string?)
   (ds/opt :defaultRuntimeClassName) string?
   })

(def policy-v1beta1-runtime-class-strategy-options
  (ds/spec
    {:name ::policy-v1beta1-runtime-class-strategy-options
     :spec policy-v1beta1-runtime-class-strategy-options-data}))

