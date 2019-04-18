(ns kubernetes.specs.v1beta2/rolling-update-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/rolling-update-deployment-data
  {
   (ds/opt :maxSurge) any?
   (ds/opt :maxUnavailable) any?
   })

(def v1beta2/rolling-update-deployment-spec
  (ds/spec
    {:name ::v1beta2/rolling-update-deployment
     :spec v1beta2/rolling-update-deployment-data}))
