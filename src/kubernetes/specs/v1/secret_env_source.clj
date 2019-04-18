(ns kubernetes.specs.v1/secret-env-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/secret-env-source-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1/secret-env-source-spec
  (ds/spec
    {:name ::v1/secret-env-source
     :spec v1/secret-env-source-data}))
