(ns kubernetes.specs.apps/v1beta1/deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apps/v1beta1/rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(def apps/v1beta1/deployment-strategy-data
  {
   (ds/opt :rollingUpdate) apps/v1beta1/rolling-update-deployment-spec
   (ds/opt :type) string?
   })

(def apps/v1beta1/deployment-strategy-spec
  (ds/spec
    {:name ::apps/v1beta1/deployment-strategy
     :spec apps/v1beta1/deployment-strategy-data}))
