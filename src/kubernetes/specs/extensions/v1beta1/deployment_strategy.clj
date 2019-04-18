(ns kubernetes.specs.extensions/v1beta1/deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/deployment-strategy-data
  {
   (ds/opt :rollingUpdate) extensions/v1beta1/rolling-update-deployment-spec
   (ds/opt :type) string?
   })

(def extensions/v1beta1/deployment-strategy-spec
  (ds/spec
    {:name ::extensions/v1beta1/deployment-strategy
     :spec extensions/v1beta1/deployment-strategy-data}))
