(ns kubernetes.specs.v1/http-header
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/http-header-data
  {
   (ds/req :name) string?
   (ds/req :value) string?
   })

(def v1/http-header-spec
  (ds/spec
    {:name ::v1/http-header
     :spec v1/http-header-data}))
