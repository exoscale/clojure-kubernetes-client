(ns clojure-kubernetes-client.specs.extensions-v1beta1-se-linux-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-se-linux-options :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-se-linux-strategy-options-data extensions-v1beta1-se-linux-strategy-options)
(def extensions-v1beta1-se-linux-strategy-options-data
  {
   (ds/req :rule) string?
   (ds/opt :seLinuxOptions) v1-se-linux-options
   })

(def extensions-v1beta1-se-linux-strategy-options
  (ds/spec
    {:name ::extensions-v1beta1-se-linux-strategy-options
     :spec extensions-v1beta1-se-linux-strategy-options-data}))

