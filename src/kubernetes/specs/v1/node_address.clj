(ns kubernetes.specs.v1/node-address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/node-address-data
  {
   (ds/req :address) string?
   (ds/req :type) string?
   })

(def v1/node-address-spec
  (ds/spec
    {:name ::v1/node-address
     :spec v1/node-address-data}))
