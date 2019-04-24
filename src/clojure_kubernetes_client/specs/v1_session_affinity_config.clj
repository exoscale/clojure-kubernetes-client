(ns clojure-kubernetes-client.specs.v1-session-affinity-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-client-ip-config :refer :all]
            )
  (:import (java.io File)))


(declare v1-session-affinity-config-data v1-session-affinity-config)
(def v1-session-affinity-config-data
  {
   (ds/opt :clientIP) v1-client-ip-config
   })

(def v1-session-affinity-config
  (ds/spec
    {:name ::v1-session-affinity-config
     :spec v1-session-affinity-config-data}))

