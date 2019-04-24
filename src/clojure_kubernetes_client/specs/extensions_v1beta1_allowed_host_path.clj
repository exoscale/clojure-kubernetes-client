(ns clojure-kubernetes-client.specs.extensions-v1beta1-allowed-host-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-allowed-host-path-data extensions-v1beta1-allowed-host-path)
(def extensions-v1beta1-allowed-host-path-data
  {
   (ds/opt :pathPrefix) string?
   (ds/opt :readOnly) boolean?
   })

(def extensions-v1beta1-allowed-host-path
  (ds/spec
    {:name ::extensions-v1beta1-allowed-host-path
     :spec extensions-v1beta1-allowed-host-path-data}))

