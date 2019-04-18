(ns kubernetes.specs.extensions/v1beta1/rolling-update-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/rolling-update-deployment-data
  {
   (ds/opt :maxSurge) any?
   (ds/opt :maxUnavailable) any?
   })

(def extensions/v1beta1/rolling-update-deployment-spec
  (ds/spec
    {:name ::extensions/v1beta1/rolling-update-deployment
     :spec extensions/v1beta1/rolling-update-deployment-data}))
