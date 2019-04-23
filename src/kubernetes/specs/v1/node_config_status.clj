(ns kubernetes.specs.v1/node-config-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-config-source :refer :all]
            [kubernetes.specs.v1/node-config-source :refer :all]
            [kubernetes.specs.v1/node-config-source :refer :all]
            )
  (:import (java.io File)))


(def v1/node-config-status-data
  {
   (ds/opt :active) v1/node-config-source-spec
   (ds/opt :assigned) v1/node-config-source-spec
   (ds/opt :error) string?
   (ds/opt :lastKnownGood) v1/node-config-source-spec
   })

(def v1/node-config-status-spec
  (ds/spec
    {:name ::v1/node-config-status
     :spec v1/node-config-status-data}))
