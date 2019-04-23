(ns kubernetes.specs.v1/deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(def v1/deployment-strategy-data
  {
   (ds/opt :rollingUpdate) v1/rolling-update-deployment-spec
   (ds/opt :type) string?
   })

(def v1/deployment-strategy-spec
  (ds/spec
    {:name ::v1/deployment-strategy
     :spec v1/deployment-strategy-data}))
