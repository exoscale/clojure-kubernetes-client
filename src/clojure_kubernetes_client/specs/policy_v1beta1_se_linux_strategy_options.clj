(ns clojure-kubernetes-client.specs.policy-v1beta1-se-linux-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-se-linux-options :refer :all]
            )
  (:import (java.io File)))


(declare policy-v1beta1-se-linux-strategy-options-data policy-v1beta1-se-linux-strategy-options)
(def policy-v1beta1-se-linux-strategy-options-data
  {
   (ds/req :rule) string?
   (ds/opt :seLinuxOptions) v1-se-linux-options
   })

(def policy-v1beta1-se-linux-strategy-options
  (ds/spec
    {:name ::policy-v1beta1-se-linux-strategy-options
     :spec policy-v1beta1-se-linux-strategy-options-data}))

