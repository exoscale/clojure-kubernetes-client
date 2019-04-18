(ns kubernetes.specs.v1/node-config-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/node-config-source-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :configMapRef) v1/object-reference-spec
   (ds/opt :kind) string?
   })

(def v1/node-config-source-spec
  (ds/spec
    {:name ::v1/node-config-source
     :spec v1/node-config-source-data}))
