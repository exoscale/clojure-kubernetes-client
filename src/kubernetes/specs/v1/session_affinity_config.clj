(ns kubernetes.specs.v1/session-affinity-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/client-ip-config :refer :all]
            )
  (:import (java.io File)))


(def v1/session-affinity-config-data
  {
   (ds/opt :clientIP) v1/client-ip-config-spec
   })

(def v1/session-affinity-config-spec
  (ds/spec
    {:name ::v1/session-affinity-config
     :spec v1/session-affinity-config-data}))
