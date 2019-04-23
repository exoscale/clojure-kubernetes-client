(ns kubernetes.specs.v1/event-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/event-series-data
  {
   (ds/opt :count) int?
   (ds/opt :lastObservedTime) inst?
   (ds/opt :state) string?
   })

(def v1/event-series-spec
  (ds/spec
    {:name ::v1/event-series
     :spec v1/event-series-data}))
