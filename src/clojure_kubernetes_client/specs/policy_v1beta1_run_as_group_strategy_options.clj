(ns clojure-kubernetes-client.specs.policy-v1beta1-run-as-group-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.policy-v1beta1-id-range :refer :all]
            )
  (:import (java.io File)))


(declare policy-v1beta1-run-as-group-strategy-options-data policy-v1beta1-run-as-group-strategy-options)
(def policy-v1beta1-run-as-group-strategy-options-data
  {
   (ds/opt :ranges) (s/coll-of policy-v1beta1-id-range)
   (ds/req :rule) string?
   })

(def policy-v1beta1-run-as-group-strategy-options
  (ds/spec
    {:name ::policy-v1beta1-run-as-group-strategy-options
     :spec policy-v1beta1-run-as-group-strategy-options-data}))

