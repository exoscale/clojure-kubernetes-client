(ns clojure-kubernetes-client.specs.v1-env-from-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-config-map-env-source :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-env-source :refer :all]
            )
  (:import (java.io File)))


(declare v1-env-from-source-data v1-env-from-source)
(def v1-env-from-source-data
  {
   (ds/opt :configMapRef) v1-config-map-env-source
   (ds/opt :prefix) string?
   (ds/opt :secretRef) v1-secret-env-source
   })

(def v1-env-from-source
  (ds/spec
    {:name ::v1-env-from-source
     :spec v1-env-from-source-data}))

