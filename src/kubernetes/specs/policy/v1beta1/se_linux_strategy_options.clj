(ns kubernetes.specs.policy/v1beta1/se-linux-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/se-linux-options :refer :all]
            )
  (:import (java.io File)))


(def policy/v1beta1/se-linux-strategy-options-data
  {
   (ds/req :rule) string?
   (ds/opt :seLinuxOptions) v1/se-linux-options-spec
   })

(def policy/v1beta1/se-linux-strategy-options-spec
  (ds/spec
    {:name ::policy/v1beta1/se-linux-strategy-options
     :spec policy/v1beta1/se-linux-strategy-options-data}))
