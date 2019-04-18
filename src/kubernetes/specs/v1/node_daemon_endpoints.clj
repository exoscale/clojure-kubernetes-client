(ns kubernetes.specs.v1/node-daemon-endpoints
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/daemon-endpoint :refer :all]
            )
  (:import (java.io File)))


(def v1/node-daemon-endpoints-data
  {
   (ds/opt :kubeletEndpoint) v1/daemon-endpoint-spec
   })

(def v1/node-daemon-endpoints-spec
  (ds/spec
    {:name ::v1/node-daemon-endpoints
     :spec v1/node-daemon-endpoints-data}))
