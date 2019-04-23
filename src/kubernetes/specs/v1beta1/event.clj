(ns kubernetes.specs.v1beta1/event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/event-source :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            [kubernetes.specs.v1beta1/event-series :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/event-data
  {
   (ds/opt :action) string?
   (ds/opt :apiVersion) string?
   (ds/opt :deprecatedCount) int?
   (ds/opt :deprecatedFirstTimestamp) inst?
   (ds/opt :deprecatedLastTimestamp) inst?
   (ds/opt :deprecatedSource) v1/event-source-spec
   (ds/req :eventTime) inst?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :note) string?
   (ds/opt :reason) string?
   (ds/opt :regarding) v1/object-reference-spec
   (ds/opt :related) v1/object-reference-spec
   (ds/opt :reportingController) string?
   (ds/opt :reportingInstance) string?
   (ds/opt :series) v1beta1/event-series-spec
   (ds/opt :type) string?
   })

(def v1beta1/event-spec
  (ds/spec
    {:name ::v1beta1/event
     :spec v1beta1/event-data}))
