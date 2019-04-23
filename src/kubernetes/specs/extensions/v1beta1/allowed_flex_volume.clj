(ns kubernetes.specs.extensions/v1beta1/allowed-flex-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def extensions/v1beta1/allowed-flex-volume-data
  {
   (ds/req :driver) string?
   })

(def extensions/v1beta1/allowed-flex-volume-spec
  (ds/spec
    {:name ::extensions/v1beta1/allowed-flex-volume
     :spec extensions/v1beta1/allowed-flex-volume-data}))
