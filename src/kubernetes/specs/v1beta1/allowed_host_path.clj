(ns kubernetes.specs.v1beta1/allowed-host-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/allowed-host-path-data
  {
   (ds/opt :pathPrefix) string?
   })

(def v1beta1/allowed-host-path-spec
  (ds/spec
    {:name ::v1beta1/allowed-host-path
     :spec v1beta1/allowed-host-path-data}))
