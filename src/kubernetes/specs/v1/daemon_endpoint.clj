(ns kubernetes.specs.v1/daemon-endpoint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/daemon-endpoint-data
  {
   (ds/req :Port) int?
   })

(def v1/daemon-endpoint-spec
  (ds/spec
    {:name ::v1/daemon-endpoint
     :spec v1/daemon-endpoint-data}))
