(ns kubernetes.specs.v1/network-policy-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1/network-policy-port-data
  {
   (ds/opt :port) any?
   (ds/opt :protocol) string?
   })

(def v1/network-policy-port-spec
  (ds/spec
    {:name ::v1/network-policy-port
     :spec v1/network-policy-port-data}))
