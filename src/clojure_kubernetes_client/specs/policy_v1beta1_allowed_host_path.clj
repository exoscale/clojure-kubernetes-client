(ns clojure-kubernetes-client.specs.policy-v1beta1-allowed-host-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare policy-v1beta1-allowed-host-path-data policy-v1beta1-allowed-host-path)
(def policy-v1beta1-allowed-host-path-data
  {
   (ds/opt :pathPrefix) string?
   (ds/opt :readOnly) boolean?
   })

(def policy-v1beta1-allowed-host-path
  (ds/spec
    {:name ::policy-v1beta1-allowed-host-path
     :spec policy-v1beta1-allowed-host-path-data}))

