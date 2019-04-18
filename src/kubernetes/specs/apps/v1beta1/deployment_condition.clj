(ns kubernetes.specs.apps/v1beta1/deployment-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def apps/v1beta1/deployment-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :lastUpdateTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def apps/v1beta1/deployment-condition-spec
  (ds/spec
    {:name ::apps/v1beta1/deployment-condition
     :spec apps/v1beta1/deployment-condition-data}))
