(ns kubernetes.specs.v1beta2/rolling-update-stateful-set-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta2/rolling-update-stateful-set-strategy-data
  {
   (ds/opt :partition) int?
   })

(def v1beta2/rolling-update-stateful-set-strategy-spec
  (ds/spec
    {:name ::v1beta2/rolling-update-stateful-set-strategy
     :spec v1beta2/rolling-update-stateful-set-strategy-data}))
