(ns kubernetes.specs.extensions/v1beta1/allowed-host-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def extensions/v1beta1/allowed-host-path-data
  {
   (ds/opt :pathPrefix) string?
   (ds/opt :readOnly) boolean?
   })

(def extensions/v1beta1/allowed-host-path-spec
  (ds/spec
    {:name ::extensions/v1beta1/allowed-host-path
     :spec extensions/v1beta1/allowed-host-path-data}))
