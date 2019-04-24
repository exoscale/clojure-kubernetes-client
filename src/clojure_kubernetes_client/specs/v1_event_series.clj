(ns clojure-kubernetes-client.specs.v1-event-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-event-series-data v1-event-series)
(def v1-event-series-data
  {
   (ds/opt :count) int?
   (ds/opt :lastObservedTime) inst?
   (ds/opt :state) string?
   })

(def v1-event-series
  (ds/spec
    {:name ::v1-event-series
     :spec v1-event-series-data}))

