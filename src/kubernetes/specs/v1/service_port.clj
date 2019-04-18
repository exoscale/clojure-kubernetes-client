(ns kubernetes.specs.v1/service-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1/service-port-data
  {
   (ds/opt :name) string?
   (ds/opt :nodePort) int?
   (ds/req :port) int?
   (ds/opt :protocol) string?
   (ds/opt :targetPort) any?
   })

(def v1/service-port-spec
  (ds/spec
    {:name ::v1/service-port
     :spec v1/service-port-data}))
