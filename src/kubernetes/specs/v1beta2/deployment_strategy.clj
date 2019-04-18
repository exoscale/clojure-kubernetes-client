(ns kubernetes.specs.v1beta2/deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta2/rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/deployment-strategy-data
  {
   (ds/opt :rollingUpdate) v1beta2/rolling-update-deployment-spec
   (ds/opt :type) string?
   })

(def v1beta2/deployment-strategy-spec
  (ds/spec
    {:name ::v1beta2/deployment-strategy
     :spec v1beta2/deployment-strategy-data}))
