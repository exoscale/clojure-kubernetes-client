(ns kubernetes.specs.policy/v1beta1/run-as-user-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.policy/v1beta1/id-range :refer :all]
            )
  (:import (java.io File)))


(def policy/v1beta1/run-as-user-strategy-options-data
  {
   (ds/opt :ranges) (s/coll-of policy/v1beta1/id-range-spec)
   (ds/req :rule) string?
   })

(def policy/v1beta1/run-as-user-strategy-options-spec
  (ds/spec
    {:name ::policy/v1beta1/run-as-user-strategy-options
     :spec policy/v1beta1/run-as-user-strategy-options-data}))
