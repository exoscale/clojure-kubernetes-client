(ns kubernetes.specs.v1beta2/stateful-set-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta2/stateful-set-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1beta2/stateful-set-condition-spec
  (ds/spec
    {:name ::v1beta2/stateful-set-condition
     :spec v1beta2/stateful-set-condition-data}))
