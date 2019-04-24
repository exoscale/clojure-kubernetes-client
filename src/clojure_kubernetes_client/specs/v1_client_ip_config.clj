(ns clojure-kubernetes-client.specs.v1-client-ip-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-client-ip-config-data v1-client-ip-config)
(def v1-client-ip-config-data
  {
   (ds/opt :timeoutSeconds) int?
   })

(def v1-client-ip-config
  (ds/spec
    {:name ::v1-client-ip-config
     :spec v1-client-ip-config-data}))

