(ns kubernetes.specs.v1/client-ip-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/client-ip-config-data
  {
   (ds/opt :timeoutSeconds) int?
   })

(def v1/client-ip-config-spec
  (ds/spec
    {:name ::v1/client-ip-config
     :spec v1/client-ip-config-data}))
