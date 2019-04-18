(ns kubernetes.specs.v1/event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-reference :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/event-source :refer :all]
            )
  (:import (java.io File)))


(def v1/event-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :count) int?
   (ds/opt :firstTimestamp) inst?
   (ds/req :involvedObject) v1/object-reference-spec
   (ds/opt :kind) string?
   (ds/opt :lastTimestamp) inst?
   (ds/opt :message) string?
   (ds/req :metadata) v1/object-meta-spec
   (ds/opt :reason) string?
   (ds/opt :source) v1/event-source-spec
   (ds/opt :type) string?
   })

(def v1/event-spec
  (ds/spec
    {:name ::v1/event
     :spec v1/event-data}))
