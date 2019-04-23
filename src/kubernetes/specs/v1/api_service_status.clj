(ns kubernetes.specs.v1/api-service-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/api-service-condition :refer :all]
            )
  (:import (java.io File)))


(def v1/api-service-status-data
  {
   (ds/opt :conditions) (s/coll-of v1/api-service-condition-spec)
   })

(def v1/api-service-status-spec
  (ds/spec
    {:name ::v1/api-service-status
     :spec v1/api-service-status-data}))
