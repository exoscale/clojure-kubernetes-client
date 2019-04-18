(ns kubernetes.specs.v1/initializer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/initializer-data
  {
   (ds/req :name) string?
   })

(def v1/initializer-spec
  (ds/spec
    {:name ::v1/initializer
     :spec v1/initializer-data}))
